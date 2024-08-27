package innerClass;

public class VariablesDemo {
    private static int a=5;
    private int b;
    VariablesDemo(int b) {
        this.b = b;
    }
    class InnerClass {
        private static int a=8;
        private int b;
        InnerClass( int b) {
            this.b = b;
        }
        void m1(){
            System.out.println("outer class a: "+VariablesDemo.a);
            System.out.println("Outer class b: "+VariablesDemo.this.b);
            System.out.println("Inner class a: "+ InnerClass.a);
            System.out.println("Inner class b: "+this.b);
        }
    }
    public static void main(String[] args) {
        VariablesDemo variablesDemo = new VariablesDemo(6);
        VariablesDemo.InnerClass obj = variablesDemo.new InnerClass(7);
        obj.m1();

    }
}
