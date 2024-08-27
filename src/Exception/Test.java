package Exception;

public class Test {
    public static void main(String[] args) throws ChekedCustomException {
//        throw new UnCheckedCustomException("exception throw from unchecked custom exception");  //this is use for unchecked custom exception.  If we need to run uncommand the line and than run.
        throw new ChekedCustomException("exception throw from checked custom exception");
    }
}

//at a time both checked and u checked not able to handle throw keyword. we ned to command any one line. But checked exception we need to handle use try,catch, or throws key word.
// If we not use any thing we are getting error.
