package extra;

import java.util.Scanner;

public class TwoDigitNo {
    static int checkTwoDigit(int a){
        if (a > 9 && a < 100) {
            System.out.println("Your no is two digit: " +a);
        }
        else {
            System.out.println("Your no is not two digit: "+a);
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your no:");
        int a= scanner.nextInt();
        checkTwoDigit(a);
    }
}
