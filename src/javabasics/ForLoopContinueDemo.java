package javabasics;

//print odd number
public class ForLoopContinueDemo {
    public static void main(String[] args) {
        for (int i =0; i<10; i++){
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
//if condition is true continue the loop, not print the value it is fail only go to print statement.
