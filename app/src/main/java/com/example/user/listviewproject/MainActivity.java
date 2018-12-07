package com.example.user.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.user.listviewproject.Adapter.EmployeeAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView employeeLV;
    private ArrayList<Employee> employees;
    private Employee employee;
    private EmployeeAdapter employeeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employeeLV=findViewById(R.id.emploeeLV);
        employee=new Employee();
        employees=employee.getAllEmployee();
        employeeAdapter=new EmployeeAdapter(this,employees);
        employeeLV.setAdapter(employeeAdapter);
        
        employeeLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, employees.get(position).getEmployeeName(), Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}
