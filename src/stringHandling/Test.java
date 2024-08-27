package stringHandling;

public class Test {
    public static void main(String[] args) {
        User user = new User(1,"suthan"); // here we can able to print user object reference memory allocation not able to print the values because this is muttable we can able to change the values
        System.out.println(user);
        String s = new String("suthan");  // here we can able to get the suthan in console becuase string is immutable not able to change
        System.out.println(s);
        Integer i = new Integer(10); // this is also same like a string
        System.out.println(i);
    }
}
