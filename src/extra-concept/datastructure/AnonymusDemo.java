package extra;

class Door{
    void ride(){
        System.out.println("You are riding a car");
    }
}
//class Window extends Door{
//    void ride(){
//        System.out.println("You are riding a window");
//    }
//}

public class AnonymusDemo {
    public static void main(String[] args) {
        Door d = new Door(){
            void ride(){
                System.out.println("You are riding a window");
            }
        };
        d.ride();

    }
}
