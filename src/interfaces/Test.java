package interfaces;

public class Test {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run(); // we can able to call sue child class object in parent class method
        bike.m1();
       // Car car = new Car(); //not able to create object in interface class
        bike.drive();
        bike.stop();
    }
}
