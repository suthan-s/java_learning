package javabasics;

public class Exercise {
     static int a =10;
    static int b = 20;
    public static void main(String[] args) {
      Exercise e = new Exercise();
        Exercise e1 = new Exercise();
      e.a = 10;
      e.b = 10;

      e1.a = 20;
     int c = e.add(e.a,e.b);
     int d = e.add(e1.a, e1.b);
//        int c = add(a,b);
     System.out.println(c);
     System.out.println(d);
    }
     int add(int a, int b){
        return a+b;
    }
}
