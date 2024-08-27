package javabasics;

public class PrmitiveAndObjectDemo {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);
        Integer b = Integer.valueOf(a);  // Boxing - primitive to change object using Wrapper class
        System.out.println(b);
        int c = b.intValue();  // Unboxing - Object to Primitive using Wrapper class
        System.out.println(c);
    }
}

// like same as float, byte, short also we can change
