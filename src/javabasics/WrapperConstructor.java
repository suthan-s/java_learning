package javabasics;

public class WrapperConstructor {
    public static void main(String[] args) {
       long a = 1000;
       Long b = new Long(a);
       System.out.println(b);
       String s ="1000";
        String s3 = new String(s);
        System.out.println(s3);
       Integer c = new Integer(s);  // Int value not able to use String
       System.out.println(c);
       String s1 ="Hello";
//       Long l = new Long(s1);   // not able to use because the value is string so not able to use int, long
//       System.out.println(l);
       String s2 = new String(s1);
       System.out.println(s2);

    }
}
