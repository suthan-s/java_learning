package abstraction;

public class Test {
    public static void main(String[] args) {
//        AbstractDemo abstractDemo = new AbstractDemo();  //not able to create object using abstract class
        AbstractDemo1 abstractDemo1 = new AbstractDemo1();
        abstractDemo1.specialActivities();
        abstractDemo1.commonActivities();
        AbsractDemo2 absractDemo2 = new AbsractDemo2();
        absractDemo2.specialActivities();
        absractDemo2.commonActivities();


    }
}
