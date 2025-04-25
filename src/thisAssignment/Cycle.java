package org.thisAssignment;

public class Cycle {

    int accountNo, noOfWheels;

    public Cycle(){
        System.out.println("i am default constructor");
    }

    public Cycle(int accountNo, int noOfWheels){
        this();
        System.out.println("i am another constructor");
    }

    public static void main(String args[]){

        Cycle c1 = new Cycle();
        Cycle c2 = new Cycle(111, 4);
    }
}
