package com.meriem.myapplicationexpert;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.meriem.myapplicationexpert.model.Employee;
import com.meriem.myapplicationexpert.model.clients;
import com.meriem.myapplicationexpert.model.contrats;
import com.meriem.myapplicationexpert.model.images;
import com.meriem.myapplicationexpert.model.interventions;
import com.meriem.myapplicationexpert.model.priorites;
import com.meriem.myapplicationexpert.model.sites;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Employee.class, clients.class, contrats.class, images.class, interventions.class, priorites.class, sites.class}, version = 1, exportSchema = false)

public abstract class IntervationDataRoom extends RoomDatabase {


    public abstract IntervationDAO intervationDAO();

    private static volatile IntervationDataRoom INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public   static IntervationDataRoom getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (IntervationDataRoom.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            IntervationDataRoom.class, "meriem")
                            .addCallback(sRoomDatabaseCallback)

                            .build();


                }
            }
        }
        return INSTANCE;
    }
    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            // If you want to keep data through app restarts,
            // comment out the following block
            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more words, just add them.
                IntervationDAO dao = INSTANCE.intervationDAO();

                dao.deleteAllEmployee();
                dao.deleteAllClient();
                dao.deleteAllInterv();
                dao.deleteAllSites();
                Employee e = new Employee("admin","123","belhaj","meriem","belhaj@gmail.com",true,0);
                dao.insert(e);
                clients c =new clients("Patrice","paris rue de paradie","65437865","6738274","patrice@gmail.com","","",0);
                dao.insert(c);
                sites s =new sites((int) 45.00,1,(float)3.00,"paris rue de paradis","rue de paradie",75000,"paris","654636373","654636373",0);
                dao.insert(s);
                try {
                    Date D = new SimpleDateFormat("yyyy-mm-dd").parse("2021-12-17");
                    Date D1 = new SimpleDateFormat("yyyy-mm-dd").parse("2021-12-19");
                    Date T1 = new SimpleDateFormat("hh:mm").parse("12.00");
                    Date T2 = new SimpleDateFormat("hh:mm").parse("13.00");

                    interventions in = new interventions("intervation",null,null,null,null,"hhhh",null,null,null,true,null,false,null,0,0);
                    dao.insert(in);
                    in = new interventions("intervation1",null,null,null,null,"hhhh",null,null,null,true,null,false,null,0,0);
                    dao.insert(in);
                    in = new interventions("intervation2",null,null,null,null,"xxxx",null,null,null,true,null,false,null,0,0);
                    dao.insert(in);
                    in = new interventions("intervation3",null,null,null,null,"gggg",null,null,null,true,null,false,null,0,0);
                    dao.insert(in);
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }



            });
        }
    };

}
