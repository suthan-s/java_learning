package extra;

public class QueueDemo {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        System.out.println(q1.dequeue());
    }
}
