package org.methodOverloading;

public class AddOverload {

    int add(long a , long b){
        System.out.println("long");
        return 0;
    }

    int add(short a,short b){
        System.out.println("short");
        return 1;
    }

    public static void main(String[] args){
        AddOverload a = new AddOverload();
        System.out.println(a.add((short)10,(short) 20));
    }
}
