package javabasics;

public class ObjectAndStringDemo {
    public static void main(String[] args) {
        short a = 230;
        System.out.println(a);
        Short b =Short.valueOf(a);
        System.out.println(b);
        String c = b.toString();
        System.out.println(c);
        Short d =Short.valueOf(c);
        System.out.println(d);

    }
}
