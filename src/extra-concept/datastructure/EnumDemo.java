package extra;
enum Days{
    SUNDAY("S"),MONDAY("M"),TUESDAY("T"),WEDNESDAY("W"),THURSDAY("A"),FRIDAY("F"),SATURDAY("B");

    private String ab;
    Days(String abr){ //constructor
        ab=abr;
    }
    public String getAb(){
        return ab;
    }
}
public class EnumDemo {
    public static void main(String[] args) {
        Days d = Days.FRIDAY; //object
        System.out.println(d);
        System.out.println(d.getAb());



    }
}
