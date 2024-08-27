package polymorphism;

public class CompileTimePolymorphism {
    public int add(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }
    public int add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
        return result;
    }
    public float add(float a, float b) {
        float result = a+b;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        CompileTimePolymorphism cp = new CompileTimePolymorphism();
        cp.add(1, 2);
        cp.add(10,20,30);
        cp.add(34.34f,45);


    }
}
