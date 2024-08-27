package stringHandling;

public class CustomImmutable {
    int x;
    CustomImmutable(int x) {
        this.x = x;
    }
    public CustomImmutable change(int x) {
        if (this.x == x) {
            return this;
        }
        else {
            return new CustomImmutable(x);
        }
    }

    public static void main(String[] args) {
        CustomImmutable m1 = new CustomImmutable(5);
        CustomImmutable m2 =m1.change(5);
        System.out.println(m1 == m2);
        CustomImmutable m3 = m2.change(10); // here we changed the value so getting false compare to current object
        System.out.println(m1 == m3);
        CustomImmutable m4 = new CustomImmutable(10);
        System.out.println(m3 == m4);


    }
}
