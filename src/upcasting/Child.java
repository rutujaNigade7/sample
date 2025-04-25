package org.upcasting;

public class Child extends Parent{

   // int data =4;

    void ran(){
        System.out.println("child ran method");
    }

    void fun(){
        System.out.println("child fun method");
    }

    public static void main(String[] args){
        Child c = new Child();
        c.fun();
        c.ran();
        c.data();
        System.out.println(c.data);
        Parent p = new Child();
        p.fun();
        p.data();
        System.out.println(p.data);

    }
}
