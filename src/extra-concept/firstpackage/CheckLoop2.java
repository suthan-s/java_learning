package extra;

import java.util.Scanner;

public class CheckLoop2 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no:");
        while (true){
            n = scanner.nextInt();
            if(n <= 0){
                break;
            }
            sum += n;
            System.out.println("Sum is "+sum);
        }
    }
}
