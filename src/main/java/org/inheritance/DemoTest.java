package org.inheritance;

import java.awt.*;

public class DemoTest extends Demo{

    int j=4;

    void add(){
        System.out.println(i+j);
    }

    public static void main(String[] args){
        DemoTest obj = new DemoTest();
        obj.add();
        System.out.println(obj.i);
    }
}
