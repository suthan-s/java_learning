package extra;

public class OverLoadingDemo3 {

    static int avg(int a, int b){
        return (a+b)/2;
    }
    static int avg(int a, int b,int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        System.out.println("Average of two number is: "+avg(2,3));
        System.out.println("Average of three no is: "+avg(3,4,5));

    }
}
