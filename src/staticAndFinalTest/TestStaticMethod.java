package org.staticAndFinalTest;

public class TestStaticMethod {

    int a = 10;

    static void change(){
        TestStaticMethod t = new TestStaticMethod();
        System.out.println(t.a);
    }

    public static void main(String args[]){
        TestStaticMethod.change();
    }
}
