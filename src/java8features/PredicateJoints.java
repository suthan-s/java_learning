package java8features;

import java.util.function.Predicate;

public class PredicateJoints {
    public static void main(String[] args) {
        int[] a={0,3,4,8,10,40,55,34,67};
        Predicate<Integer> p=i->(i>10);//lambda expression
        Predicate<Integer> p1 =i->(i%2==0);
        System.out.println("Greater than 10: ");
        method1(p,a);
        System.out.println("even no: ");
        method1(p1,a);
        System.out.println("not greater than 10:");
        method1(p.negate(),a);
        System.out.println("odd no:");
        method1(p1.negate(),a);
        System.out.println("Greater than 10 and even no:");
        method1(p.and(p1),a);
        System.out.println("Greater than 10 or even no:");
        method1(p.or(p1),a);

    }
    static void method1(Predicate<Integer> p,int[] x){
        for (int y:x){
            if(p.test(y)){
                System.out.println(y);
            }
        }

    }
}
