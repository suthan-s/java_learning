package java8features;

public class Test2 {
    public static void main(String[] args) {
       // Runnable r = new MyRunnable();
      //  Thread t = new Thread(r);  // we can directly call run method use"r" but we need to create new Thread for create new thread and than we can able to make a call
        //t.start();


        // now we will implement the lambda line no 5 to 7 normal

        Runnable r =()->{
            for(int i=1;i<=10;i++) {
                System.out.println("Inside child lambda method");
            }
        };
        Thread t1 = new Thread(r);
        t1.start();  //now we first get "child lambda method" and than we can get "main method" but normal we get first "main thread" line print and than "child lambda method"

        for (int i = 0; i < 10; i++) {
            System.out.println("Inside main thread");
        }
    }
}
