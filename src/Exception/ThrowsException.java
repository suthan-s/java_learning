package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    void fileRead() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("");
    }
    public static void main(String[] args) throws FileNotFoundException {
        ThrowsException t = new ThrowsException();
        t.fileRead();
    }
}
//here we not used try catch block using throws key word exception. In method declare line we can directly give the throws exception.
// where we are calling that method there also (main method) we need to give throws message.
//but if we are used throws getting internal message. If we used try catch block we can give the exception message.
