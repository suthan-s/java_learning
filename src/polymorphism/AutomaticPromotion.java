package polymorphism;

public class AutomaticPromotion {
//    public void print(int i){
//        System.out.println("Integer value: "+i);
//    }
    public void print(float f){
        System.out.println("Float value: "+f);
    }
    public static void main(String[] args) {
        AutomaticPromotion automaticPromotion = new AutomaticPromotion();
        automaticPromotion.print(19);   //if we don't have print method for int parameter java automatically promot the next type that is called automatic promotion
        automaticPromotion.print(23.45f);

    }
}
