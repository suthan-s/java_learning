package interfaces;

public class Bike implements Car{
    void m1(){
        System.out.println("In side Bike m1");
    }

    @Override
    public void drive() {
        System.out.println("In side Bike drive");
    }

    @Override
    public void stop() {
        System.out.println("In side Bike stop");

    }
}
