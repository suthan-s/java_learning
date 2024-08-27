package java8features;

public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.method1();

       // C c1 = ()-> System.out.println("Inside method 1 from lamda"); we not able to use "c" class
        A a =()-> System.out.println("Inside method 2 from lamda");// we can able to use "A" interface for lambda expression
        a.method1();
    }
}
