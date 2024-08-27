package java8features;

public class Test4 {
    static void myMethod(){
        System.out.println("inside Test4 class method myMethod");
    }
    public static void main(String[] args) {
        MethodRef a = Test4::myMethod;
        a.method1();
    }
}
