package org.abstraction;

public class Geeks {

    public static void main(String args[]){
        TestClass tc = new TestClass();
        tc.display();
        System.out.println(tc.a);
        System.out.println(TestInterface1.a);
        tc.m1();
        TestInterface1.m2();

        new Thread(() -> System.out.println("New Thread created")).start();
    }
}
