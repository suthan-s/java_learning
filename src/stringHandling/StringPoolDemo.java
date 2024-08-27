package stringHandling;

public class StringPoolDemo {
    public static void main(String[] args) {
        User user1 = new User(1,"abc");
        User user2 = new User(1,"abc");
        System.out.println(user1);  // if we pass same value in object create different memeory location
        System.out.println(user2);

        String s1 ="abc";
        String s2 ="xyz";
        String s3 ="abc";
        System.out.println(s1.hashCode()); // string is create only one me ory location for all once e change the value only string will change the location
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
