package javabasics;

public class LoopExercise {
    public static void main(String[] args) {
        int n = 150;
        for (int i =1; i<=n; i++){
            if (i==100){
                break;
            }
            if (i%10==0){
                continue;
            }
            System.out.println(i);
        }
        int a =1;
        while (a<=n){
            if (a==100){
                break;
            }
            if (a%10==0){
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
        int b =1;
      do {
          if (b%10!=0){
              System.out.println(b);
          }
          b++;
      }
      while (b<=100);
    }
}
