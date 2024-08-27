package arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // this is one way for declare two dimensional array (3*3) row*column
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}}; // this is another one way
        for (int i = 0; i < arr1.length; i++) { // i-row
            for (int j = 0; j < arr1[i].length; j++) {  //j -column
                System.out.print(arr1[i][j]);
            }
            System.out.println(); //fro using next line
        }
    }
}
