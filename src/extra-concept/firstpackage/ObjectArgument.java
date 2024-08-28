package extra;

public class ObjectArgument {
    public ObjectArgument(int i, int i1, int i2) {
//        int a = i.a;
        int b = i1;
        int c = i2;
    }

    public static void main(String[] args) {
        ObjectArgument box = new ObjectArgument(2,4,6);
        ObjectArgument box1 = new ObjectArgument(2,4,6);
//        System.out.println("Box is equal to Box1: "+box.isEqual(box1));
    }


}
