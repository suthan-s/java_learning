package Exception;

import java.util.Scanner;

public class Division {
    int a,b,c;
    public static void main(String[] args) {
        try {
            System.out.println("Enter the numbers:");
            Scanner sc = new Scanner(System.in);
             int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Don't use no zero");
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("More code can go here:");
    }
}
// here we handle the try catch block for exception now we are getting catch block message instead of exception error.
// Once catch block completed we can go next print statement also.