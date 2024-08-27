package Exception;

public class MoreException {
    public static void main(String[] args) {
        String s= "hello";
        System.out.println(s.length());
        String a=null;
        System.out.println(a.length()); // we are getting null pointer exception because a is null
    }
}
