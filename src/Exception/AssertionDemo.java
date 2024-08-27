package Exception;

public class AssertionDemo {
    public static void main(String[] args) {
        int withDrawl=100;
        int savingsAmount=70;
        assert withDrawl<savingsAmount:"savings amount is less than withdrawal amount"; //for getting assertion error we need to enable the assert use "-ea" in edit configuration->modify option->add vm option->use "-ea"
    }
}

// if we are not giving the edit configuration we not able to the error message we need to enable that.
// if we need to get the meaning full error message we need to add the expression2 "savings amount is less than withdrawal amount".