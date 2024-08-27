package javabasics;

public class StaticObjectDemo {
    static {
        StaticObjectDemo obj = new StaticObjectDemo();
        System.out.println(obj);  // we can able to get the address of that object
    }
    public static void main(String[] args) {
        System.out.println("Hello World");

    }
}
