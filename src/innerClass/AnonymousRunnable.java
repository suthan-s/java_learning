package innerClass;

public class AnonymousRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {  //anonymous runnable class
            @Override
            public void run() {
                System.out.println("Hello World");

            }
        });
        thread.start();  // we can call start jvm automatically invoke.
    }
}
