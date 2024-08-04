package org.constructor;

public class Test1 {

    Test1(){
        System.out.println("default con");
    }

    Test1(int x){
        System.out.println(x);
    }

    Test1(int x,int y){
        this(5);
        System.out.println(x*y);
    }

    public static void main(String args[]){
        new Test1(10,20);
    }
}
