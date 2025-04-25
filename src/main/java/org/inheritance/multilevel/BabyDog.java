package org.inheritance.multilevel;

public class BabyDog extends Dog{

    BabyDog(){
        System.out.println("BabyDog");
    }

    public static void main(String[] args){
        BabyDog obj =new BabyDog();
        System.out.println(obj.s+ " "+ obj.i);
        obj.eat();
        obj.bark();
    }
}
