package innerClass;

public class LocalInnerClass {
    void m1(){
        System.out.println("m1 method from outside");
        class InnerClass{  //local inner class because we create inside the method. here not able to use access modifier
            void m2(){
                System.out.println("m2 method from inside");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.m2(); //inside this method only we can able to call this method using inner class object
    }
    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.m1();
       // localInnerClass.m2(); //not able to call m2 method using outer class object
    }
}
