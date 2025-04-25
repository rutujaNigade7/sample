package org.arrays.assignment.twodiamensionalArr;

public class MaxOfRow {

    public static void main(String args[]){

        int test[][] = new int[][]{{22,31,9},{12,25,16}};

        for(int i=0;i<test.length;i++){
            int max = test[i][0];
            for(int j=1;j<test[i].length;j++){
                if(test[i][j] > max){
                    max = test[i][j];
                }
            }
            System.out.println("Maximum of row " + i + " is: " + max);
        }
    }
}
