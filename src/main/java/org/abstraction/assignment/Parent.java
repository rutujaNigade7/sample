package org.abstraction.assignment;

public abstract class Parent {

    public Parent(int x){
        System.out.println("Parent constructor" + x);
    }
    abstract void cook();

    void wash(){
        System.out.println("wash");
    }
}
