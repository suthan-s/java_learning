package arrays;
//create the program instead of 5 replace 0 . condition only after no 3 we have 5 replace 0
public class ArrayProgram1 {
    public static void main(String[] args) {
        int a[] ={3,4,5,6,3,5,8,5};
        for (int i = 0; i < a.length; i++) {
            if (a[i]==3 && a[i+1]==5){
                a[i+1]=0;
            }
        }
        for (int i:a){
            System.out.println(i);
        }
    }
}
