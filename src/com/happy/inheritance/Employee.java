package com.happy.inheritance;

public class Employee {
    public int id;
    public String name;
    public double salary;
    public String department;

    public Employee(int id, String name, double salary, String department) {
        System.out.println("Inside Employee Constructor");
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void work(){
        System.out.println("Employee do common work");
    }
}
