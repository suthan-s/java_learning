package java8features;

public class AnonymousDemo {
    public static void main(String[] args) {
        Thread r=new Thread(new Runnable() {   // this is normal
            public void run() {
                for(int i=1;i<=10;i++) {
                    System.out.println("Inside child thread");
                }
            }
        });
        r.start();

        // now we create use lambda
        Thread t = new Thread(()->{
            for(int i=1;i<=10;i++) {
                System.out.println("Inside child lambda thread");
            }
        }
        );
        t.start();
        for(int i=1;i<=10;i++) {
            System.out.println("Inside main thread");
        }
    }
}
