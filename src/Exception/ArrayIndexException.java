package Exception;

public class ArrayIndexException {
    public static void main(String[] args) {
        int arr[]={10,20,30};
        try {
            System.out.println("Elements of array:");
            for (int i = 0; i <=arr.length; i++) {
//            for(int i=0;i<=arr.length;i++)  //if we are used i<=arr.length we are getting exception error, in this exception error we need to handle
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
