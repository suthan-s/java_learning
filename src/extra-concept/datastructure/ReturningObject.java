package extra;

public class ReturningObject {
    int length;
    int breadth;
    int depth;


//    constructor
    ReturningObject(int l, int b, int d){
         length = l;
        breadth = b;
        depth = d;
    }
   ReturningObject doubleBox(){
        ReturningObject b4 = new ReturningObject(2*length,2*breadth,2*depth);
        return b4;

    }

    public static void main(String[] args) {
        ReturningObject b1 = new ReturningObject(5,3,4);
        ReturningObject b2 = new ReturningObject(4,5,1);
        ReturningObject b3 = b2.doubleBox();
        System.out.println("this is length: "+b3.length);
        System.out.println("this is breadth: "+b3.breadth);
        System.out.println("this is depth: "+b3.depth);


    }
}
