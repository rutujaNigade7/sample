package org.methodOverloading;

public class Test extends Derived{

    public void getDetails(String temp){
        System.out.println("Test "+temp);
        //return 0;
    }

    public static void main(String[] args){
        Test t = new Test();
        t.getDetails("Hello");
    }
}
