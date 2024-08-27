package javabasics;

public class CommandLineArguments {
    public static void main(String[] args) {
        int length = args.length;
        System.out.println("Length of arguments: " + length);
        if (length ==0){
            System.out.println("No arguments provided");
        }
        else {
            System.out.println("Arguments provided:");
            for (int i =0; i<length; i++){
                System.out.println(args[i]);
            }
        }

    }
}


// edit configuration program arguments we need to give data and than only we can run
