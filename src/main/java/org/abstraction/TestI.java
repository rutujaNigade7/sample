package org.abstraction;

public class TestI implements PI1,PI2{

    /*public void show(){
        PI1.super.show();
        PI2.super.show();
    }*/

    /*public void showOfPI1(){
        PI1.super.show();
    }

    public void showOfPI2(){
        PI2.super.show();
    }*/

    public static void main(String args[]){
        TestI ti = new TestI();
        ti.show();
    }


    @Override
    public void show() {
        PI1.super.show();
    }
}
