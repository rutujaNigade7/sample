package org.inheritance.hierarchical;

public class Car extends Vehical{

    int wheel = 10;

    void show(){
        System.out.println(wheel);
    }

    public static void main(String[] args){
        Car c = new Car();
        System.out.println(c.wheel);
        c.show();
    }
}
