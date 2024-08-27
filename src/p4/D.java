package p4;

public class D {
    public static void main(String[] args) {
        A.a();      //In this package class A
        p3.A.a();   //Same class name using another one package so use "package.classname"
    }
}
