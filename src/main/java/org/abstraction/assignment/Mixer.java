package org.abstraction.assignment;

public abstract class Mixer extends Machine {

    public void crush(){
        System.out.println("crush");
    }

    void blend(){
        System.out.println("blend");
    }

    public static void main(String args[]){
        //Mixer m = new Mixer();

    }
}
