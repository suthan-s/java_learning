package extra;

public class OverLoadingdemo2 {
    static void test(){
        System.out.println("This methos has no arguments");
    }
    static void test(int a, int b){
        System.out.println("This methos has 2 arguments");
    }
    static void test(int a){
        System.out.println("This methos has one arguments");
    }

    public static void main(String[] args) {
        test(1);
        test();
        test(10,3);
        test(15,23);
    }
}
