package extra;

public class Queue {
    int a[] = new int[5];
    int s=-1;

    void enqueue(int b){
        if(s==4){
            System.out.println("Stack is full");
        }
        else {
            a[++s] = b;
        }
    }
    int dequeue(){
        for(s=4; s<=0; s-- ) {
            if (s == -1) {
                return s;
            }
        }
        return -1;

    }

}
