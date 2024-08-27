package javabasics;

public class ExplicitCasteDemo {
    public static void main(String[] args) {
        int a = 100;
        byte b = (byte) a; // directly not getting need to explicit type cast, because we changed higher value to lower(int to byte)

        int c = 245;
        char d = (char)(c); //int to char need explicit type cast but char to int don't need explicit type cast
        System.out.println(b);
        System.out.println(d);
    }
}
