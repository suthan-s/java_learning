package java8features;

import java.util.function.Predicate;

public class StringDemo {
    public static void main(String[] args) {
        Predicate<String> p = s->(s.length()>5);
        System.out.println(p.test("hello"));
        System.out.println(p.test("world"));
        System.out.println(p.test("Suthan"));

    }
}
