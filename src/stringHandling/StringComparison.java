package stringHandling;

public class StringComparison {
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 = "abc";
        String s3 = "xyz";
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println(s1 == s2);  // "==" checking the memory location same for tow strings
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));  // "equals"  checking the content is same for two strings
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s4);  //here we getting false. if we create the string object constructor any way jvm create new memory location
        System.out.println(s1.equals(s4)); // here  we getting true becuase equals checking the content.
        System.out.println(s4 == s5); //here also getting false becuase jvm create new memory location for string object anyway.
        System.out.println(s4.equals(s5));

        User user1 = new User(1,"abc");
        User user2 = new User(1,"abc");
        System.out.println(user1 == user2);  ////here also getting false becuase jvm create new memory location for object anyway.
        System.out.println(user1.equals(user2)); ////here also getting false becuase in object equal method checking the memory location not checking the content, but string checking the content.
    }
}
