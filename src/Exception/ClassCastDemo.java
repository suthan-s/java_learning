package Exception;

public class ClassCastDemo {
    public static void main(String[] args) {
//        Object object =new Object();
//        String s= (String) object;  // we are getting error because we not able to object cast to string
        Object object =new Object();
        if(object instanceof String){  //if we used instanceof we are not getting error we can able to cast the string to object
            String s= (String) object;
        }
        Object object1 =new String();  // if we use String we can able to cast the string to object
        String s= (String) object1;
    }
}
