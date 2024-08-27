package javabasics;

public class Exercise1 {
    static String BankName ="Bank of India";
    int Accno;
    String AccName;
    int Balance;
    public static void main(String[] args) {
        double intrest = 4.5;
        System.out.println(BankName);
//        System.out.println(Accno); // not able to print becuase non static variable
        Exercise1 e = new Exercise1();
        System.out.println(e.Accno); // before initialize also we can use
        e.Accno = 123;
        e.AccName ="suthan";
        e.Balance = 3000;
//        System.out.println(Accno); // not able to print we can use (e.Accno)
        System.out.println(e.Accno);
        System.out.println(e.AccName);
        System.out.println(e.Balance);
        System.out.println(intrest);  // before intialize not able to print directly we can able to run no need object because local variable


    }
}
