package org.abstraction;

public interface TestInterface1 {

    final int a =   10;

    void display();

    default void m1(){
        System.out.println("default method");
    }

    static void m2(){
        System.out.println("static method");
    }

    
}
