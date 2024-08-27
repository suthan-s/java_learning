package javabasics;

public class ExplicitTypeCasteDemo1 {
    public static void main(String[] args) {
        int a = 234;
        byte b = (byte) a;  //234 is the outer range of byte so print different value. byte range(-128 to 127)
        System.out.println(b);
    }
}
