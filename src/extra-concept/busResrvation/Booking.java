package extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengername;
    int age;
    String gender;
    Date date;
    int busno;

     Booking(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your Bus NO: ");
         busno = scanner.nextInt();
         System.out.println("Enter your Name: ");
         passengername = scanner.next();
         System.out.println("Enter your Age: ");
         age =scanner.nextInt();
         System.out.println("Enter your gender: ");
         gender = scanner.next();
         System.out.println("Enter your travel Date: ");
         String dateinput = scanner.next();
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
         try {
            date = dateFormat.parse(dateinput);
         } catch (ParseException e) {
             throw new RuntimeException(e);
         }

     }

    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> booking) {
         int capacity = 0;
         for (Bus bus:buses){
             if (bus.getBusno() == busno){
                 capacity = bus.getCapacity();

//                 System.out.println("this is capacity: "+capacity);
             }
         }
        int booked = 0;
         for (Booking b:booking){
             if (b.busno == busno && b.date.equals(date)){
                 booked++;
             }
         }
         return booked < capacity?true:false;


    }
}
