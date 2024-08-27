package java8features;

import java.util.Optional;

public class OptionaDemo {
    public static void main(String[] args) {
       Optional<String> a= Optional.empty();
       System.out.println(a.isPresent()); // isPresent method return boolean data type if the value has return true else return false
        Optional<String> b = Optional.of("Hi i am suthan");
        System.out.println(b.isPresent()); // here we get true
        System.out.println(b.get()); // here we get the our input value
       // System.out.println(a.get()); // here we get exception because we don't have a value. for handle the exception we used if condition
        if (a.isPresent()){
            System.out.println(a.get());
        }

        System.out.println(b.filter((s)->s.equals("Hi i am suthan")));// if the value is matched we are get optional and that value
        System.out.println(b.filter((s)->s.equals("i i am suthan"))); // if the value is not matched we are get "optional.empty"

        System.out.println(b.orElse("how are you")); // here we have a value for "b" so we are get the exist value
        System.out.println(a.orElse("how are you")); // here we have a value fro "a" is empty so now our new value is add.

        b.ifPresent(System.out::println); // here we get the o/p for that b
        a.ifPresent(System.out::println); // here we not able to get the o/p because a is empty
    }
}
