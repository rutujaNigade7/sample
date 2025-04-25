package org.inheritance.hierarchical;

public class Boy extends Person{

    void disp(){
        System.out.println("boy");
    }

    public static void main(String[] args){
        Boy b = new Boy();
        System.out.println(b.name+ " "+ b.addr);
        b.disp();
    }
}
