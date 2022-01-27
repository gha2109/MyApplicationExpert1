package com.meriem.myapplicationexpert;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;;
import com.meriem.myapplicationexpert.model.Employee;
public class MainActivity extends AppCompatActivity {
    EditText login,pwd;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (EditText) findViewById(R.id.login);
        pwd = (EditText) findViewById(R.id.pwd);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(v -> {

            LiveData<Employee> liveData=
                    LoginViewModel.getUser(login.getText().toString(),pwd.getText().toString());
            liveData.observe(MainActivity.this,employee->{if (employee==null)
            {
                //Log.e("emmmmmmmmmmmmmmmmmm",employee.getLogin());
                Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
                login.setError("login erronee");
                pwd.setError("password errone");

            }
            else
            {
                startActivity(new Intent(MainActivity.this,NavigationDrawerr.class));
            }});

        });

    }
        }
