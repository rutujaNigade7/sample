package org.looping.forLoop;

public class Pattern8 {

    public static void main(String args[]){

        int sp=2, sp1=1;

        for(int i=1;i<=3;i++){
            for(int k=1;k<=sp;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++){
                if(i%2==0)
                    System.out.print("# ");
                else
                    System.out.print("@ ");
            }
            System.out.println();
            sp--;
        }


        for(int i=2;i>=1;i--){
            for(int k=1;k<=sp1; k++)
                System.out.print(" ");
            for(int j=i;j>=1;j--){
                if(i%2==0)
                    System.out.print("# ");
                else
                    System.out.print("@ ");
            }
            System.out.println();
            sp1++;
        }
    }
}
