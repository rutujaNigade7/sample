package org.inheritance;

public class Dogs extends Animal{

    void show(){
        System.out.println(legs);
    }

    public static void main(String[] args){
        Dogs d = new Dogs();
        d.show();
        d.eat();
        System.out.println(d.legs);
    }
}
