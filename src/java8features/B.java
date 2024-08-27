package java8features;

@FunctionalInterface
public interface B extends A {
//    void method3();
    void method1();  // we can use only parent class methid only if we use @FunctionalInterface annotation
}
