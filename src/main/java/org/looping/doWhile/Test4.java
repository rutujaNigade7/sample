package org.looping.doWhile;

public class Test4 {

    public static void main(String args[]){
        int a=3,b=3;
        do{
            System.out.println(a);
        }while(a++<=4 && ++b<=3);

        System.out.println(a +""+ b);
    }
}
