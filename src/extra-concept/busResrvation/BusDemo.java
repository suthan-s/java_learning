package extra;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> booking = new ArrayList<Booking>();

        buses.add(new Bus(1,true, true, 2));
        buses.add(new Bus(2, true, true, 100));
        buses.add(new Bus(3, true, true,150));

        for (Bus b:buses){
            b.isDisplayBusDetails();
        }

        int useroption = 1;
        Scanner scanner = new Scanner(System.in);
        while (useroption == 1) {
            System.out.println("Enter 1 for Booking, 2 for Exit");
            useroption = scanner.nextInt();
            if (useroption == 1) {
                Booking book  = new Booking();
                if (book.isAvailable(buses,booking)) {
                    booking.add(book);
                    System.out.println("Your booking is confirmed");
                }else{
                    System.out.println("Buses all full you can try another buses or another date");
                }
            }

        }

    }
}
