package org.methodOverloading;

public class Child extends Parent{

    int a=20;
    void m2(){
        System.out.println("child method");
    }

    void m1(){
        System.out.println("m1 child method");
    }

    public static void main(String[] args){
        Parent c = new Child();
        System.out.println(c.a);
        //c.a=100;
        c.m1();

        //downcasting
        Child c1 = (Child)c;
        c1.m1();
        c1.m2();
        System.out.println(c1.a+ " ");
    }
}
