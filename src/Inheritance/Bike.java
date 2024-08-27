package Inheritance;

public class Bike extends Vehicle{
    @Override
    String fuel(){  //override the same method
        return "Petrol";
    }
}
