package constructorChaining;

public class Parent {
    public Parent(){
        System.out.println("No arguments Parent Constructor");
    }
    public Parent(int a){
        this();
        System.out.println("One arguments Parent Constructor");
    }
}
