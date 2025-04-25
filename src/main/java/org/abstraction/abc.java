package org.abstraction;

public class abc implements abcInterface{

    int i =3;
    public void add(){
        System.out.println("add");
    }

    public static void main(String args[]){
        abcInterface obj = new abc();
        System.out.println(obj.i);
        obj.add();
        obj.show();
        abcInterface.print();
    }
}
