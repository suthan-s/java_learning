package Inheritance;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Child child = new Child(); // Both class constructor indicate same memory location because of inherit
        child.m2();
        child.m1();   // we can bale to access using child class object because of inherit the parent class
        Jdk8 jdk8 = new Jdk8();  // JVM first invoke the parent class constructor and than only print child classes

    }
}

