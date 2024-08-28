package extra;

abstract class Shape{
    abstract void area();
}
class Squara extends Shape{
    public void area(){
        System.out.println("This is area method");
    }
}
class Triangle extends Shape{
    public void area(){
        System.out.println("This is Triangle method");
    }
}
public class Square {
    public static void main(String[] args) {
        Shape[] s = new Shape[4];
        s[0] = new Squara();
        s[1] = new Squara();
        s[2] = new Triangle();
        s[3] = new Triangle();

        for (Shape s1:s){
            s1.area();
        }

    }
}
