package org.staticAndFinalTest;

public class Child extends parent{

    static void show(){
        System.out.println("child method");
    }

    /*final void method(){

    }
*/
    final void method(int a){

    }
    public static void main(String args[]){
        parent.show();
        Child.show();

        Child obj=new Child();
        obj.show();

        parent obj1 = new parent();
        obj1.method();
    }
}
