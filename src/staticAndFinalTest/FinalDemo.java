package org.staticAndFinalTest;

public class FinalDemo {

    final int x;

    public FinalDemo(){
        x = 10;
    }

    final void method2(){
        System.out.println("method2");
    }

    public static void main(String args[]){
        FinalDemo fd = new FinalDemo();

    }
}
