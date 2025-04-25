package org.abstraction.assignment;

public interface Test1 extends Test{

    int i =2;
    default void add(){
        System.out.println("Hello");
    }
}
