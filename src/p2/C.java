package p2;

import p1.A;

public class C extends A {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.d);
        C c = new C();
        System.out.println(c.d);
        System.out.println(c.c); //not able to get c variable use object 'a' only able to use c object because of extends
    }
}
