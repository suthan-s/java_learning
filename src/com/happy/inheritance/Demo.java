package com.happy.inheritance;

public class Demo extends DemoFather{

    Demo(){

    }

    Demo(Demo d) {

    }

     void m1(){
        Demo d1 = new Demo(this);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();



    }
}

class DemoFather{

     void m1(){
        System.out.println("m1");
    }
}
