package arrays;
// check inside array first and last char same or not
public class CharArray {
    public static void main(String[] args) {
        char a[] ={'a','s','d','f','a'};
        if (a[0] == a[a.length-1]){
            System.out.println("first and last elements is same");
        }
        else {
            System.out.println("first and last elements is different");
        }
    }
}
