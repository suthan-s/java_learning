package javabasics;

public class StacticObjectGlobal {
    static StacticObjectGlobal obj; // object created outside like globally
    static {
        System.out.println(obj);
        StacticObjectGlobal.obj = new StacticObjectGlobal();
        System.out.println(obj);
        System.out.println(StacticObjectGlobal.obj); // both we can print

    }
    public static void main(String[] args) {
        System.out.println(obj);
        System.out.println(StacticObjectGlobal.obj);

    }
}
