package Exception;

public class StackOverFlowException {
    public static void method1(){
        System.out.println("Inside method1");
        method2();
    }
    public static void method2(){
        System.out.println("Inside method2");
        method1();
    }

    public static void main(String[] args) {
        method1();  // we are getting stack over flow exception error here repetadely we are calling here

    }
}
