package org.abstraction.assignment;

public class Demo implements Test, Test1{

    public static void main(String args[]){
        Demo d =new Demo();
        d.add();
        System.out.println(Test.i + Test1.i);
    }
}
