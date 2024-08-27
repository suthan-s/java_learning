package abstraction;

public  abstract class AbstractDemo {   //abstract class
    void commonActivities(){
        System.out.println("Inside commonActivities");
    }
    abstract void specialActivities(); //this is abstract method no need open and end flower bracket
    static {
        System.out.println("Inside abstaract demo static block"); //we can able to get using child class object
    }
    {
        System.out.println("Inside abstaract demo non static block");   //we can able to get using child class object
    }
}
