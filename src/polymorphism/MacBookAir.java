package polymorphism;

public class MacBookAir extends MacBook{
    @Override
    public void start() {
        System.out.println("start method from MacBookAir");
    }

    @Override
    public void stop() {
        System.out.println("stop method from MacBookAir");
    }
    public void run(){    //inthis method we can able to access create the object using this class reference
        System.out.println("run method from MacBookAir");
    }
}
