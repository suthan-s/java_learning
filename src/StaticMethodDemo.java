public class StaticMethodDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        StaticMethodDemo.method1();
    }
    static void method1(){
        System.out.println("Inside method1");
    }
    static {
        System.out.println("Inside Static method");
        StaticMethodDemo.method1();
    }
}

//static method we can call use class name.methodname. We don't need create object. first run static block and then only run inside main method.

