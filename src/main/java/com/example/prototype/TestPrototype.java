package com.example.prototype;

import java.util.List;

public class TestPrototype {

    public static void main(String args[]) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();

        // Clones
        Employee newEmployees = (Employee) employee.clone();
        Employee newEmployees1 = (Employee) employee.clone();

        List<String> list = newEmployees.getEmployees();
        list.add("Jacques");
        List<String> list1 = newEmployees1.getEmployees();
        list1.remove("John");

        System.out.println("employees : " + employee.getEmployees());
        System.out.println("newEmployee : " + list);
        System.out.println("newEmployee1 : " + list1);
    }
}
