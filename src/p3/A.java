package p3;

public class A {
    public static void a(){
        System.out.println("Inside A");
    }
    public void b(){
        System.out.println("Inside B");
    }
    public static void main(String[] args) {
        A.a();   //static method we can use directly call use class.method
        A obj = new A();
        obj.b();
    }
}
