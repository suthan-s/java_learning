package extra;

abstract class Member{
    private String name;
    abstract void welcomeMessage();
}
class Person extends Member{
    void welcomeMessage(){
       System.out.println("Hello Student");
   }
}
class Teacher extends Member{
    void welcomeMessage(){
        System.out.println("Hello Teacher");
    }

}


public class AbstractDemo {
    public static void main(String[] args) {
        Person p =  new Person();
        Teacher t=new Teacher();

        Member m2 = new Person();
        Member m1 = new Teacher();

        Member[] m = new Member[4];
        m[0] = new Teacher();
        m[1] = new Teacher();
        m[2] = new Person();
        m[3] = new Person();

        for (Member m3:m){
            m3.welcomeMessage();
        }


    }
}
