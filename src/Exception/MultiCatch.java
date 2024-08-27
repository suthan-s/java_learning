package Exception;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            String input = args[0];
            System.out.println("Input: " + input);
            int output = Integer.parseInt(input);
            System.out.println("Output: " + output);
        }
        catch (ArrayIndexOutOfBoundsException e) {  // If we not give any input in edit configuration we are getting ArrayIndexOutOfBoundsException error. we can use both "ArrayIndexOutOfBoundsException","Exception" object.
            System.out.println("We need to give input in edit configuration");
        }
        catch (NumberFormatException e) {
            System.out.println("We need to give input in int in edit configuration");
        }

        System.out.println("More code can go here:");
    }
}
// we can use only common "Exception" object for both of the catch block. If we use "Exception" only na one catch block handle the all exception.
// Don't need crete other exceptions.If we give any string value in edit cofiguration we are getting "NumberFormatException".