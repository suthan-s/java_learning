package extra;

public class Factorial {
    static int fact(int n){
        if (n ==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Factorial of 5 is: "+fact(n));
    }
}
