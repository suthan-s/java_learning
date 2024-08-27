package javabasics;

public class ForLoopBreakDemo {

    public static void main(String[] args) {
        for (int x=20; x>=1; x--){
            if (x ==10){
                break;
            }
            System.out.println(x);
        }
    }
}
