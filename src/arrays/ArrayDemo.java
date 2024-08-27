package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //int arr[5]; // we are getting syntax error because inside not able to give 5
       // int arr[] ={10, 20,30,40,50};  // this is correct one proper syntax we follow
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = new Integer(20); // this is auto boxing using wrapper type class
      //  arr[2] = 10.56; // we are getting compile time error. becuase not use double
        arr[2]=30;
      //  arr[7] =70; // we are not compile time error but get runtime error arrayindexoutofboundexception
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]); // here we used 0,1,2 not use 3, 4 so we getting default value 0 in o/p. If we are use "i<=arr.length we are getting run time error arrayindexoutofboundexception
        }
        for (int results: arr){
            System.out.println(results); // this is enhanced loop or for each loop
        }



    }
}