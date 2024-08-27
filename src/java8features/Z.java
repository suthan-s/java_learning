package java8features;

public class Z implements X,Y{

    @Override
    public void m1() {
        System.out.println("Inside class Z method m1"); // we can first give print statement and than we can able to make a call to super class.
        X.super.m1(); // call X interface using super.
        Y.super.m1();
        System.out.println("Inside class Z method m1");
    }
}
// if we implements two interfaces that two interfaces having same methods.If we implements that two interface in one class we are getting compile time error.
// if we implements one interface we are not getting error. so in that class we need to override the method (line no 6).
