package extra;

interface Train{
    int amount = 100;
    void ride();
    default void display(){
        System.out.println("Display here");
        System.out.println("amount: " + amount);
    }
}
class Plane implements Train {
    public void ride () {
        System.out.println("I am riding a plane");
    }
}
class Ship implements Train{
    public void ride () {
        System.out.println("I am riding a ship");
    }
}
class Cycle{
    public void phase(Train a) {
        System.out.println("I am cycle");
        a.ride();
    }
}
public class LambdaDemo {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Ship ship = new Ship();
        Cycle cycle = new Cycle();
        Train train = new Plane();
//        plane.ride();
//        ship.ride();
//        cycle.phase(plane);
//        cycle.phase(ship);
        Train t1 = new Ship();
//        train.ride();
//        t1.ride();
//        train.display();
//        t1.display();
        Train t = () -> System.out.println("I am plane Suthan");  ///Lambda expression
        t.ride();
        t.display();

    }
}
