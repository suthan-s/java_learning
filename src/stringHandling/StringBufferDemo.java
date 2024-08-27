package stringHandling;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("Capacity: "+sb.capacity()); //print the capacity of string buffer
        sb.append("Hello World. ");
        System.out.println("Capacity: "+sb.capacity());
        sb.append("i can do anything.");
        System.out.println(sb); // print the our appand words
        System.out.println("Capacity: "+sb.capacity()); // print the our word capacity
        System.out.println("CharAt: "+sb.charAt(24));
        StringBuffer sb2 = new StringBuffer("abcdef"); // use pass the string constructor
        System.out.println("Capacity: "+sb2.capacity());
        System.out.println("reverse: "+sb2.reverse()); // reverse the string
        System.out.println("insert: "+sb2.insert(3,"x")); // add the 'x' value in index 3
        System.out.println("delete: "+sb2.delete(3,4));  // delete from 3rd index not delete the 4th index
    }
}
