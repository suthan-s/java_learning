package extra;

public class  SumDigitsMethod {
    int a,b,c;
     static int sumOfDigits(int a, int b, int c){
        int sum= a+b+c;
        return sum;

    }
    public static void main(String[] args) {
        int sum =sumOfDigits(10,20,30);
        int sum1 =sumOfDigits(100,20,30);
        System.out.println(sum);
        System.out.println(sum1);
    }
}
