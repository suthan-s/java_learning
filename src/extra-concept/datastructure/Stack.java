package extra;

public class Stack {
    int s[] = new int[10];
    int tos=-1;

    void push(int a){
        if(tos==9){
            System.out.println("Stack is full");
        }
        else {
            s[++tos] = a;
        }
    }
    int pop(){
        if (tos>=0){
            return s[tos--];
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }


}
