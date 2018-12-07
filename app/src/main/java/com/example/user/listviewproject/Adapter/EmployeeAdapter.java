package com.example.user.listviewproject.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.INotificationSideChannel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.user.listviewproject.Employee;
import com.example.user.listviewproject.R;
import java.util.ArrayList;

public class EmployeeAdapter extends ArrayAdapter<Employee> {

    //Variable Declaration
    private Context context;
    private ArrayList<Employee> employees;

    public EmployeeAdapter(@NonNull Context context, ArrayList<Employee>employees) {
        super(context, R.layout.employee_list,employees);
        this.context=context;
        this.employees=employees;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(R.layout.employee_list,parent,false);
        ImageView empIV = convertView.findViewById(R.id.employeeImage);
        TextView empName = convertView.findViewById(R.id.employeeName);
        TextView empDes = convertView.findViewById(R.id.employeeDesignation);

        empIV.setImageResource(employees.get(position).getEmployeeImage());
        empName.setText(employees.get(position).getEmployeeName());
        empDes.setText(employees.get(position).getEmployeeDesignation());

        return convertView;
    }
}
