package innerClass;

public class InnerClassDemo {
    static void m(){
        System.out.println("Outer class method");
    }
    void m1(){
        System.out.println("m1 non static method from outer class");
    }
    static class InnerClass {
        static void m(){
            System.out.println("Inner class method");
        }
        void m1(){
            System.out.println("m1 non static method from inner class");
        }
    }
    public static void main(String[] args) {
        InnerClassDemo.m();
        InnerClassDemo.InnerClass.m();
        InnerClassDemo obj = new InnerClassDemo(); //object for outer classs
        obj.m1();
        InnerClassDemo.InnerClass obj1 = new InnerClassDemo.InnerClass(); //object for inner class
        obj1.m1();
    }
}
//In method we can use same or different name. Inside static class if we need to call use "mainclass.innerstaticclass.methodname".
//non static method we need to call create object. Inside static class use "outercall.innerclass" for create object
