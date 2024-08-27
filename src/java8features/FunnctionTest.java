package java8features;

import java.util.function.Function;

public class FunnctionTest {
    public static void main(String[] args) {
        Function<String,Integer> f= s-> (s.length());
        System.out.println(f.apply("suthan"));
        System.out.println(f.apply("roy"));
    }
}
