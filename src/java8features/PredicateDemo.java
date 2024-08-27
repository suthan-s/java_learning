package java8features;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p = i->(i>30); //  use lambda expression
        System.out.println(p.test(20));
        System.out.println(p.test(30));
        System.out.println(p.test(35));
        System.out.println(p.test(38));  // returns boolean
    }
}
