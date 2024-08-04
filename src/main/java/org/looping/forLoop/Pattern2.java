package org.looping.forLoop;

public class Pattern2 {

    public static void main(String args[]) {
        int sp = 2;

        for (int i=1;i<=3;i++) {
            for(int k=sp;k>=1;k--)
                System.out.print(" ");

            for(int j=1;j<=i;j++)
                System.out.print((char)(64+i)+ " ");

            System.out.println();
            sp--;
        }
    }
}
