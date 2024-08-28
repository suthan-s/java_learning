package extra;

interface  Auto{
    default void ride() {

    }
}

class Car implements Auto{
    public void ride(){
        System.out.println("You are riding a car");
    }
}
class Bike implements Auto{
    public void ride(){
        System.out.println("You are riding a bike ");
    }
}
class Mechanic{
    void check(Auto a){
            System.out.println("You are riding a Mechanic");
            a.ride();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        Mechanic m = new Mechanic();
//        Auto a = new Auto();
        Auto a = new Car();

        m.check(c);
        m.check(b);
    }
}
