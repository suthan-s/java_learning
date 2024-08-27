package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("Suthan"); //if we are not handle exception using try catch block we are getting error. we need to handle manually.
        }
        catch (FileNotFoundException e) {
        }

    }
}
