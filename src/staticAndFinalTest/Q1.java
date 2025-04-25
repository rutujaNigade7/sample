package org.staticAndFinalTest;

public class Q1 {

    static String model;
    static int totalCarSold;

    void change(){
        model = "changedModel";
        totalCarSold = 200;
    }

    void display(){
        System.out.println(model+" "+totalCarSold);
    }

    public static void main(String args[]){
        System.out.println(model+" "+totalCarSold);
        Q1.model = "BMW";
        Q1.totalCarSold = 100;
        System.out.println(model+" "+totalCarSold);

        Q1 c1 = new Q1();
        c1.change();
        Q1 c2 = new Q1();
        c2.display();
    }
}
