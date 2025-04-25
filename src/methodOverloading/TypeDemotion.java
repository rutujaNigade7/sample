package org.methodOverloading;

public class TypeDemotion {

    void add(float a){
        System.out.println("welcome");
    }

    public static void main(String[] args){
        TypeDemotion t =new TypeDemotion();
        t.add(3.2f);
    }
}
