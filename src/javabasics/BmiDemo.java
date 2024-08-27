package javabasics;

public class BmiDemo {
    public static void main(String[] args) {
        //BMI = weight in kg/height* height(m)
        double weight = 55;
        double height = 6.5;
        double heightInMeter = height * 0.4536;
        double result = weight/heightInMeter*heightInMeter;
        System.out.println(result);

    }
}
