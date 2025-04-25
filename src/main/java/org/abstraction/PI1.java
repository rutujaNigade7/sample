package org.abstraction;

public interface PI1 extends GPI{

    default void show(){
        System.out.println("pi1");
    }
}
