package org.abstraction;

public interface PI2 extends GPI{

    default void show(){
        System.out.println("default PI2");
    }
}
