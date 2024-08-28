package extra;

public class StackCharDemo {
    public static void main(String[] args) {
        StackChar s1 = new StackChar();
        s1.push('a');
        s1.push('b');
        s1.push('d');
//        s1.push('f');
//        s1.push('v');
        System.out.println(s1.pop());

    }
}
