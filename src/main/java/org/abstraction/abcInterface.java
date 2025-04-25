package org.abstraction;

public interface abcInterface {

    int i =10;
    default void show(){
        System.out.print("show method");
    }
    static void print(){
     System.out.println("static method");
    }

    void add();
}
