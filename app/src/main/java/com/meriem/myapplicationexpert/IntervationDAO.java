package com.meriem.myapplicationexpert;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.meriem.myapplicationexpert.model.Employee;
import com.meriem.myapplicationexpert.model.Intervention;
import com.meriem.myapplicationexpert.model.clients;
import com.meriem.myapplicationexpert.model.interventions;
import com.meriem.myapplicationexpert.model.sites;

import java.util.List;

@Dao
public interface IntervationDAO {
    //employee
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Employee emp);
   @Query("DELETE FROM employes")
  void deleteAllEmployee();

    @Query("SELECT * FROM employes WHERE login LIKE :login AND pwd LIKE:pwd")
    static LiveData<Employee> getUser(String login, String pwd) {
        return null;
    }

    //interventions
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(interventions i);
    @Query("DELETE FROM interventions")
    void deleteAllInterv();

    // Sites
   @Insert(onConflict = OnConflictStrategy.REPLACE)
   void insert(sites site);
    @Query("DELETE FROM sites")
    void deleteAllSites();

    //clients
   @Insert(onConflict = OnConflictStrategy.REPLACE)
   void insert(clients cl);
    @Query("DELETE FROM clients")
    void deleteAllClient();


    @Query("SELECT title as title,sites.adresse,nom,datedebut,datefin   from  interventions INNER JOIN sites ON sites.id=interventions.idSite INNER JOIN clients ON sites.idclient= clients.id")
    default LiveData<List<Intervention>> getInterventions() {
        return null;
    }

}
