package org.abstraction.assignment;

public interface Test {

    int i =10;
    default void add(){
        System.out.println("Hi");
    }
}
