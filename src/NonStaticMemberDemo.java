public class NonStaticMemberDemo {
    int sum = 100; // non static variable
    NonStaticMemberDemo(){
        System.out.println("Inside constructor");  //non static constructor
    }
    {
        System.out.println("Inside non static block");  // for non static block running code we need crete object in main method lin 11
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        NonStaticMemberDemo obj = new NonStaticMemberDemo();  // call for non static constructor create object and then only able to call

    }
}

// first execute main method and then execute the JVM non static block then only execute the constructor part.
