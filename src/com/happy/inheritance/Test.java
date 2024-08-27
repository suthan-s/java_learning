package com.happy.inheritance;

public class Test {
    public static void main(String[] args) {
        String[] projects = new String[] {"Onboarding","Migration","Kitchen Interior Projects"};
        Manager manager = new Manager(1,"John",1000,"Retail",projects);
        System.out.println(manager.id);
        System.out.println(manager.name);
        System.out.println(manager.department);
        System.out.println(manager.salary);
        manager.work();
        Developer developer = new Developer(2,"Suthan",2000,"Retail","Java");
        System.out.println(developer.id);
        System.out.println(developer.name);
        System.out.println(developer.department);
        System.out.println(developer.salary);
        System.out.println(developer.technology);
        developer.work();
    }
}
