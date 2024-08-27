package superKeyWord;

public class Child extends Parent {
    int c,d;

    Child(int a, int b, int c, int d) {
        super(a, b);    //using super method we can able to access the parent class. First we need to give super and then only we can able to give instance variable like using this keyword
        this.c = c;     //after "this" instance variable we use super method we are getting error
        this.d = d;
    }
    void display(){
        System.out.println("Parent a: "+super.a);
        System.out.println("Parent b: "+super.b);
        System.out.println("Parent c: "+this.c);
        System.out.println("Parent d: "+this.d);
    }

    void m1(){
        super.m1();      //we can able to print the parent clas method also
        System.out.println("Inside Child super keyword m1");
    }
}
