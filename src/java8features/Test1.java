package java8features;

public class Test1 {
    public static void main(String[] args) {
        Sum s=(a,b)->System.out.println("Sum is: "+(a+b));
        s.sum(10,20);
    }
}
