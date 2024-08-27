package java8features;

public class Test6 {
    public static void main(String[] args) {
        MyInterface i = s-> new MyClass(s);
        i.get("using lambda expression"); // here we can invoke the constructor using lambda expression

        MyInterface a = MyClass::new;
        a.get("Using constructor mapping");
    }
}
