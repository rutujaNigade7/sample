package org.looping.forLoop;

public class Pattern4 {

    public static void main(String args[]){

        int sp=2,sp1=1;

        for(int i=1;i<=3;i++){
            for(int k=sp;k>=1;k--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print((char)(64+i)+ " ");
            System.out.println();
            sp--;
        }
        for(int i=2;i>=1;i--){
            for(int k=1;k<=sp1;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print((char)(64+i)+ " ");
            System.out.println();
            sp1++;
        }
    }
}
