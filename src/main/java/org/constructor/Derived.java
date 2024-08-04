package org.constructor;

public class Derived extends Base{

    Derived(){
        System.out.println("no-arg constructor of derived class");
    }

    Derived(String name){
        //super(name);
        System.out.println("calling parameterized constructor of derived class");
    }

    public static void main(String args[]){
       // Derived obj = new Derived("test");
        Derived obj1 = new Derived();
    }
}
