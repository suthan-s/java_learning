public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    static {
        System.out.println("Static Block 1");
    }
    static {
        System.out.println("Static Block 2");
    }

}
//If we run the code first execute the static block and then only main method will be execute. How many static we have running orderly.
// First deirectly JVM run the static block