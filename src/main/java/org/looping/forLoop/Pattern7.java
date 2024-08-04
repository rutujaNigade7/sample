package org.looping.forLoop;

public class Pattern7 {

    public static void main(String args[]){

        int num1=0,num2=1, c=1;

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(c + " ");
                c=num1+num2;
                num1=num2;
                num2=c;
            }
            System.out.println();
        }
    }
}
