package stringHandling;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println("Length of the characters: "+s1.length());  // space also one character
        System.out.println("Index of the character: "+s1.indexOf('o')); // index is start from no 0
        System.out.println("Index of the character: "+s1.lastIndexOf('o')); // giving the last index of the letter. if we have tow character in same letter
        System.out.println("charAt: "+s1.charAt(1)); // if we give the index no getting the equal  character
        System.out.println("Use begin index only: "+s1.substring(4)); // if we use begin index only print from the index till last
        System.out.println("use begin and end index: "+s1.substring(4,9)); //print the value from 4 th index but not print the end index(9 th) before 9th index till print
        System.out.println("replace: "+s1.replace('l','s')); // replace where ever we have 'l' replace 's'
        System.out.println("upper case: "+s1.toUpperCase()); // change to full a capital letter
        System.out.println("lower case: "+s1.toLowerCase()); // change to full a small letter
        System.out.println(s1.split(" ")); // not able to print directly because split is provide array of string
        String[] words = s1.split(" ");  // here split use the space
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        String[] words1 = s1.split("r");  // here split use the 'r' not print the r go to next line
        for (int i = 0; i < words1.length; i++) {
            System.out.println(words1[i]);
        }
    }
}
