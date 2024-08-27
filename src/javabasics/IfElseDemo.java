package javabasics;

public class IfElseDemo {
    public static void main(String[] args) {
        int  maths = 75;
        int physics = 89;
        int chemistry =90;
        int average = (maths + physics + chemistry)/3;
        if (average <35){
            System.out.println("Fail");
        } else if (average <60) {
            System.out.println("Grade C");
        }
        else if (average <70) {
            System.out.println("Grade B");
        }
        else
            System.out.println("Grade A");
    }
}
