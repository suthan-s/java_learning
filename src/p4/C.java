package p4;

import p3.A;

public class C {
    public static void main(String[] args) {
        A.a();    //we need to import the call for other packages
        A a = new A();
        a.b();
    }
}
