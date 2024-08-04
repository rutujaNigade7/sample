package org.looping.forLoop;

public class StarPattern1 {

    public static void main(String args[]){

        for(int i=1;i<=4;i++){

            for(int k=1;k<=(i-1);k++){
                System.out.print("* ");
            }

            for(int j=i;j<=4;j++){
                System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("#############################");

        for(char c='D'; c>='A'; c--){
            for(char d=c; d<='D'; d++){
                System.out.print(d);
            }
            System.out.println();
        }
    }
}
