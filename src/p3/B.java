package p3;

import p3.p5.E;

public class B {
    public static void main(String[] args) {
        A.a();       //static method we can use directly call use class.method
        A a = new A();
        a.b();
        E e = new E();
        e.a();    // for accessing we need to import the package line no 3. inside child packages also we need to import and then only we can able to access.
    }
}
