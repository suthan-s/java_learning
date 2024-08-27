package constructorChaining;

public class Child extends Parent{
    public Child(){
        this(10);
        System.out.println("No arguments Child Constructor");
    }
    public Child(int a){
        super(a);
        System.out.println("One arguments Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }

}
// First call child constructor (line no 4) then call Child with argument constructor using "this" keyword, then call parent constructor using "super" keyword.
// Parent with argument constructor call normal Parent constructor. So that's happening called Constructor chaining.
// We can able to do Constructor chaining to use super, this keywords.
