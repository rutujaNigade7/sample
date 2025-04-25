package org.inheritance;

public class Truck extends Vehical{

    Truck(){
        System.out.println("child constructor");
    }

    void show(){
        System.out.println(wheel);
    }

    public static void main(String[] args){
        Truck tObj = new Truck();
        tObj.show();
    }
}
