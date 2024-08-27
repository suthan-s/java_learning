package arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        String a[] ={"Java Web Services","Spring Data REST","Hibernate","Spring in easy steps"};
        int n = a.length;
        for(int i=n-1; i<n; i--) {
            if (i==-1){
                break;
            }
            System.out.println(a[i]);
        }
    }
}
