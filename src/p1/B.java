package p1;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
      //  System.out.println(obj.a);  //not able to print because of private variable
    }
}
