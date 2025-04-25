package org.inheritance;

public class DemoTest1 extends Demo1{

    int i=4;
    void add(){
        System.out.println(i+i);
    }

    public static void main(String[] args){
        DemoTest1 obj = new DemoTest1();
        obj.add();
        System.out.println(obj.i);
    }
}
