package org.method;

public class Q1 {

    int id=1;
    String name="tqpp";

    void displayData(){
        id=2;
        name="hello";
        System.out.println(id + " " + name);
    }

    public static void main(String[] args){
        Q1 s = new Q1();
        System.out.println(s.id+ " "+ s.name);
        s.displayData();
        System.out.println(s.id+ " "+ s.name);
    }
}
