package org.abstraction.assignment;

public class Juicer extends Machine{

    public void crush(){
        System.out.println("crush");
    }

    void filter(){
        System.out.println("filter");
    }

    public static void main(String args[]){

        Juicer j1 = new Juicer();
        j1.rotate();
        j1.crush();
        j1.filter();

        Machine m = new Juicer();
        m.crush();
        m.rotate();
    }
}
