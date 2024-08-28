package extra;

import java.util.Scanner;

public class SwitchVowelProgram {
    public static void main(String[] args) {
        char alphapet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Alphapet");
        alphapet = scanner.next().charAt(0);
       char Alphapet = Character.toLowerCase(alphapet);
        System.out.println("Your Alphapet is "+Alphapet );
        switch (Alphapet){
            case 'a','e','i','o','u':
                System.out.println("Your Alphapet is Vowel "+Alphapet );
                break;
            default:
                System.out.println("Your Alphapet is Constant "+Alphapet );

        }
    }
}
