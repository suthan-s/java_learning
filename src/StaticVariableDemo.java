public class StaticVariableDemo {
    static int num = 10;
    int count = 20;
    public static void main(String[] args) {
        System.out.println(StaticVariableDemo.num); // we can directly print use the variable name but classname.variable name is correct format
//        System.out.println(count); //Inside static method not able to use normal variable only able to use static variable. If we need to print create object[
    }
     void m1(){
        System.out.println(count);// This is not a static method so we can able to print the value
         System.out.println(num);  // static variable also we can print
    }

}
