package javabasics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter your digits:");
        Scanner scanner= new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());
        int num3 = num1+num2;
        System.out.println(num3);
    }
}
