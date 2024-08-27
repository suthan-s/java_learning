package enums;

public class Test {
    public static void main(String[] args) {
        PaymentType p = PaymentType.CASH;
        System.out.println(p); // we can able to get the string value because enum by default call tostring method.

        PaymentType[] p1=PaymentType.values(); // 'values" method comes from Enums parents class. because every enum class internally extends the Enum parent class
        for (PaymentType p2 : p1) {
            System.out.println(p2);
            System.out.println(p2.ordinal()); // ordinal provide the position
            System.out.println(p2.getFee());


        }
    }
}
