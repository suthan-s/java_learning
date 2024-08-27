package innerClass;

public class OuterClassDemo {
    void m1(){
        System.out.println("m1 non static method from OuterClassDemo");
    }
    static void m2(){
        System.out.println("m2 static method from OuterClassDemo");
    }
    class OuterClass{
        void m1(){
            System.out.println("m1 non static method from OuterClass");
        }
        static void m2(){
            System.out.println("m2 static method from OuterClass");
        }
    }
    public static void main(String[] args) {
        OuterClassDemo.m2();
        OuterClassDemo obj = new OuterClassDemo();
        obj.m1();
        OuterClassDemo.OuterClass.m2();
        OuterClassDemo.OuterClass obj1 = obj.new OuterClass();
        obj1.m1();

    }
}
