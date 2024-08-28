package extra;

public class StackChar {
    char a[] = new char[5];
     char tos = (char) -1;

//     StackChar(){
//         tos = (char) -1;
//     }

     void push(char s){
         if (tos ==4){
             System.out.println("Stack is full");
         }
         else
            a[++tos] = s;
     }
     int pop(){
         if (tos>=0){
             return a[tos--];
         }
         else{
             System.out.println("Stack is empty");
             return -1;
         }
     }

}
