package java8features;

public class Test5 {
    void method2(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        MethodNonSataicRef m = i-> System.out.println(i);
        m.method1(9);  // we invoke the method using lam,bda expression
        Test5 test5 = new Test5();
        MethodNonSataicRef a = test5::method2;
        a.method1(7);

    }
}
