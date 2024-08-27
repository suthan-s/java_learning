package Inheritance;

public class OverrideTest {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println(bike.fuel());
        Car car = new Car();
        System.out.println(car.fuel());
    }
}
