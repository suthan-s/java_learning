package extra;

class Outer{
    int a;
    public void outer(){
        System.out.println("This is outer");
    }
    class Inner{
        int b;
        public void inner(){
            System.out.println("This is inner");

        }
    }

}
public class IneerDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.a=10;
        System.out.println(o.a);
        o.outer();
        Outer.Inner i = o.new Inner();
        i.inner();

    }
}
