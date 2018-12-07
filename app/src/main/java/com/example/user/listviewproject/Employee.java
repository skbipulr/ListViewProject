package com.example.user.listviewproject;

import java.util.ArrayList;

public class Employee  {
    private  int employeeImage;
    private String employeeName;
    private String employeeDesignation;

    //Constructor Declaration
    public Employee(){

    }

    public Employee(int employeeImage, String employeeName, String employeeDesignation) {
        this.employeeImage = employeeImage;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
    }

    //Method Declaration

    public int getEmployeeImage() {
        return employeeImage;
    }

    public void setEmployeeImage(int employeeImage) {
        this.employeeImage = employeeImage;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public ArrayList<Employee> getAllEmployee(){
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Engineer"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Ripon Sarkar","Doctor"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        employees.add(new Employee(R.mipmap.ic_launcher,"Bipul Sarkar","Teacher"));
        return employees;
    }
}
