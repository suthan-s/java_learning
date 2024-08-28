package extra;

import java.util.Scanner;

public class CheckLoop {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no:");
        n = scanner.nextInt();
        while(true){
            if (n%10 == 0){
                System.out.println(n);
                break;
            }
            n--;
        }


    }
}
