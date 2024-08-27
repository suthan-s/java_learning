package polymorphism;

public class Test1 {
    public static void main(String[] args) {
        Parent.m1();   //static method not able to override only call use the class name
        Child.m1();
        Parent p = new Parent();
        Child c = new Child();
        System.out.println(p.s);
        System.out.println(c.s);
        Parent p1 = new Child();   //using parent class instance also we are getting parent class variable
        System.out.println(p1.s);
    }
}
