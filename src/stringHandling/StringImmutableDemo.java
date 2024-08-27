package stringHandling;

public class StringImmutableDemo {
    public static void main(String[] args) {
        String s1 ="suthan";
        String s2 = "roy";
        System.out.println("before concat: "+s1 +" "+s2);
        s1.concat(s2);
        System.out.println("after concat: "+s1 +" "+s2);
        s2=s1.concat(s2); // afeter concat we need to assign the value to any one variable other wise string value is not change, so that is immutable
        System.out.println("after concat: "+s1 +" "+s2);
    }
}
