package javabasics;

public class InvokeNonStaticMethod {
    public static void main(String[] args) {
        InvokeNonStaticMethod obj = new InvokeNonStaticMethod();
        obj.init();
        System.out.println("Hello world");
    }
    void init(){
        System.out.println("I am inside method");
    }
}
