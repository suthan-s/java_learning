package javabasics;

public class CommandLineArgumentDemo {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);   // arguments is getting from edit configuration
        int num1 = Integer.parseInt(args[1]);
        int result = num*num1;
        System.out.println(result);


    }
}
