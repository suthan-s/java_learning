package stringHandling;

public class StringDemo {
    public static void main(String[] args) {
        String s ="suthan";
        String s1 = new String("roy");
        char c[] = {'a','e','i','o','u'};
        String s2 = new String(c); // use char array
        byte b[] ={76,67,89};
        String s3 = new String(b);  // use byte value array convert the respective string value

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
