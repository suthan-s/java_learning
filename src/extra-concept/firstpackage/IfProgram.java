package extra;

import java.util.Scanner;

public class IfProgram {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        a = scanner.nextInt();
        if(a>0){
            System.out.println("Number is positive" +a);
        }
        else{
            System.out.println("Number is negative" +a);
        }
    }

    }
