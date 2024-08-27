package java8features;

@FunctionalInterface
public interface A {
    void method1();
   // void method2(); if use one more method we are getting compile time error because we used @FunctionaInterface annotation
}
