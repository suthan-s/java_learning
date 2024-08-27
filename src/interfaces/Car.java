package interfaces;

public interface Car {
    default void run(){
        System.out.println("Car run");
    }   // we can able to call in fro child class
    void drive();   //this is automatically public and abstract method we don't need give that
    void stop();
}
