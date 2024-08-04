package org.constructor;

public class Base {

    String name;
    Base(){
        this(" ");
        System.out.println("no-arg constructor of base class");
    }

    Base(String name){
        this.name = name;
        System.out.println("calling parametreized constructor of base class");
    }
}
