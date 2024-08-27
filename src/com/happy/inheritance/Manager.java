package com.happy.inheritance;

public class Manager extends Employee{
    String[] projects;
    public Manager(int id, String name, double salary, String department, String[] projects) {
        super(id, name, salary, department);
        System.out.println("Inside Manager Constructor");
        this.projects = projects;
    }

    @Override
    public void work() {
        super.work();
        for (int i = 0; i < projects.length; i++) {
            System.out.println(projects[i]);
        }
    }
}
