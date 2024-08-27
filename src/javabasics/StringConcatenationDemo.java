package javabasics;

public class StringConcatenationDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        int a=10,b=20, c=30;
        System.out.println(s1+s2);
        System.out.println(a+b+c);
        System.out.println(s1+a+b+c);  //first put string "s1" so next int value not add only concatenat
        System.out.println(a+b+s1+c);  // first two int values only add next put string so only append.

    }
}
