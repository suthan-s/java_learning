package javabasics;

public class SingleInheritance {
    void a(){
        System.out.println("Inside method A");
    }
    public static void main(String[] args) {
        SingleInheritance si = new SingleInheritance();
        si.a();
        si.hashCode();
        si.getClass();

    }
}

//line no 10,11 internally getting form java.lang.Object package.
