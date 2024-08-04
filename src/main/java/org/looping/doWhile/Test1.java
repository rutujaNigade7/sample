package org.looping.doWhile;

public class Test1 {

    public static void main(String args[]){

        int a =1;
        do{
            System.out.println(a);
        }while(a++ <= 3);

        System.out.println("after do-while loop : " + a);
    }
}
