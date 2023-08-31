package com.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{

    private List<String> employees;

    public Employee(){
        this.employees = new ArrayList<>();
    }

    public Employee(List<String> employees){
        this.employees = employees;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void loadData(){
        // Load all employees from database and put into the list
        this.employees.add("John");
        this.employees.add("David");
        this.employees.add("Jan");
        this.employees.add("Elie");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        this.employees.forEach(e->list.add(e));
        return new Employee(list);
    }
}
