package polymorphism;

public class MacBookPro extends MacBook {
    @Override
   public void start() {
        System.out.println("start method from MacBook Pro");
    }

    @Override
    public void stop() {
        System.out.println("stop method from MacBook Pro");
    }
}
