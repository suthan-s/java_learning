package com.happy.inheritance;

public class Tester extends Employee{
    String[] tools;
    public Tester(int id, String name, double salary, String department, String[] tools) {
        super(id, name, salary, department);
        this.tools = tools;
    }

    @Override
    public void work() {
        super.work();
        for (int i = 0; i < tools.length; i++) {
            System.out.println(tools[i]);
        }
    }
}
