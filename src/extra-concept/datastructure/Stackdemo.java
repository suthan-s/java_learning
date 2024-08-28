package extra;

public class Stackdemo {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(2);
        s1.push(4);
        s1.push(5);
        s1.push(12);
        s1.push(13);
        s1.push(34);
        s1.push(45);
        s1.push(56);
        s1.push(23);
        s1.push(89);
//        s1.push(78);
        System.out.println(s1.pop());
        System.out.println(s1.pop());

    }

}
