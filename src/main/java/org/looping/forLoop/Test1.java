package org.looping.forLoop;

public class Test1 {

    public static void main(String args[]){

        int i=1;

        for( ;i<=5;i++){
            System.out.println("hello");
        }

        for(int j=1,k=2; j<=5||k<=5; j+=2,k+=2){
            System.out.println(j*j + " " + (k*k*k));
        }

        for(int j=0;j<=5;j++);{
            System.out.println("facebook");
            //System.out.println(j); j is not in scope.
        }
    }
}
