package encapsulation;

public class Test {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setFirstName("suthan");
        c.setLastName("san");
        c.setCreditCardNo(234);
        System.out.println(c.getFirstName());
        System.out.println(c.getLastName());
        System.out.println(c.getCreditCardNo());
    }
}
