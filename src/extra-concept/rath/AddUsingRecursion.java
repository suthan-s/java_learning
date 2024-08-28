package extra;

public class AddUsingRecursion {
     static int total =0;
    public static int total(int n){
        if(n<=0){
            return total;
        }
        total +=n;
        return total(n-1);
    }

    public static void main(String[] args) {
        System.out.println(total(10));
    }
}

