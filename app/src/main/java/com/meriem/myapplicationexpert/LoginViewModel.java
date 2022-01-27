package com.meriem.myapplicationexpert;



import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.meriem.myapplicationexpert.model.Employee;

public class LoginViewModel extends AndroidViewModel {
    IntervationDAO intervationDAO;
    public LoginViewModel(@NonNull Application application) {
        super(application);

        IntervationDataRoom db = IntervationDataRoom.getDatabase(application);
        intervationDAO= (IntervationDAO) db.intervationDAO();

    }

    static LiveData<Employee> getUser(String Login, String Pwd) {

        return IntervationDAO.getUser(Login, Pwd);
    }
    void Insert(Employee emp)
    {
        intervationDAO.insert(emp);
    }
}
