package org.abstraction;

public class TestInterface implements BInrterface{

    public void show(){

    }
    /*public void print(){

    }*/

    public static void main(String args[]){
        TestInterface obj = new TestInterface();
        System.out.println(obj.i);
    }

    @Override
    public void print() {

    }
}
