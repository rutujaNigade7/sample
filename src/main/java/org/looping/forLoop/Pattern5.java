package org.looping.forLoop;

public class Pattern5 {

    public static void main(String args[]){

        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print((char)(64+j));
            System.out.println();
        }

        for(int i=1;i<=3;i++){
            for(int j=1;j<=(i+1);j++)
                System.out.print((char)(64+j));
            System.out.println();
        }
    }
}
