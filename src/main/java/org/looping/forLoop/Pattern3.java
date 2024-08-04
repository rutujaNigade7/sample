package org.looping.forLoop;

public class Pattern3 {

    public static void main(String args[]){

        int sp=3;

        for(int i=1;i<=4;i++){
            for(int k=sp;k>=1;k--)
                System.out.print(" ");
            for(int j=i;j>=1;j--){
                if(i%2==0)
                    System.out.print("# ");
                else
                    System.out.print("@ ");
            }
            System.out.println();
            sp--;
        }
    }
}
