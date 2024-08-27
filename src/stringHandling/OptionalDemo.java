package stringHandling;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> a = Optional.empty();
        System.out.println("isPresent: "+a.isPresent());
        System.out.println("a data get: "+a.get());
    }

}
