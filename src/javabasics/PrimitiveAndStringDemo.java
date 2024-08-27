package javabasics;

public class PrimitiveAndStringDemo {
    public static void main(String[] args) {
        float a = 10.5f;
        System.out.println(a);
        String b = Float.toString(a);  //change primitive to string using wrapper class
        System.out.println(b);
        float c = Float.parseFloat(b);  //change string to primitive using wrapper class
        System.out.println(c);


    }
}
