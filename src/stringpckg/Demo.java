package org.stringpckg;

public class Demo {

    public static void main(String args[]){

        //Dog d = new Dog(); // output : dog  //tight coupling
        Animal d = new Dog();
        d.eat(); // output : dog // loose coupling
    }
}
