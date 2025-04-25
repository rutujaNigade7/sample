package org.abstraction.assignment;

public class Child extends Parent{

    public Child(){
        super(10);
        System.out.println("child constructor");
    }
    void cook(){
        System.out.println("cook");
    }

    public static void main(String args[]){
        Child c = new Child();
        c.wash();
        c.cook();
    }
}
