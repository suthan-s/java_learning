package com.happy.inheritance;

//  instance variable
// this to call current class method
//current class constructor
//this as obj parameter in method
//this as obj parameter in constructor
//this as current class instance in return

public class Developer extends Employee{
    String technology;
    public Developer(int id, String name, double salary, String department , String technology) {
        super(id, name, salary, department);
        System.out.println("Inside Developer Constructor");
        System.out.println(this);

        this.technology = technology;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Developer works successfully: "+technology);
    }
}
