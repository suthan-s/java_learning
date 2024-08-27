package javabasics;

public class ThisKeyWordDemo {
    int x = 100;
    ThisKeyWordDemo(){   // Constructor
        System.out.println(this);// Indicated the object memory address  ; Static method not able to use This keyword only able to use non static
        System.out.println(x);
        System.out.println(this.x); // both also we can able to get

    }
    public static void main(String[] args) {
        ThisKeyWordDemo obj = new ThisKeyWordDemo();
        new ThisKeyWordDemo(); // This also object
    }
}
