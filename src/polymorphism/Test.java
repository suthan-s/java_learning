package polymorphism;

public class Test {
    public static void main(String[] args) {
        MacBookAir m1 = new MacBookAir();   //using parent class reference create the object for child class
        MacBook m2 =  new MacBookPro();
        MacBook m3 = new MacBook();
        MacBookAir m4 = new MacBookAir();
        AppleBook m5 = new MacBookPro();//using inteface class also crete object and can access the child class method
        AppleBook m7= new MacBook();
        MacBookAir m8 = m1;

        MacBookAir m9 = (MacBookAir) new MacBook();


      //  MacBookAir m6 = (MacBookAir) new MacBook();  //object casting (down stream casting) crete the object using child class reference
        m1.start();
        m1.stop();
        m2.start();
        m2.stop();
        m3.start();
        m3.stop();
        m4.start();
        m4.stop();
        m5.start();
        m5.stop();
        m7.start();
        m4.run();
        m8.stop();
        //m6.stop();
        //m6.run();   //using m6 object only able to call this method other method not able to use.
    }
}
