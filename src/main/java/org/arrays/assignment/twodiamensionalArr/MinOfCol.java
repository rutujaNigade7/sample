package org.arrays.assignment.twodiamensionalArr;

public class MinOfCol {

    public static void main(String args[]){

        int test[][] = new int[][]{
                {22,31,9},{12,5,16},{34,42,2}
        };

        for(int i=0;i<test[0].length;i++){
            int min = test[0][i];
            for(int j=1;j<test.length;j++){
                if(test[j][i] < min){
                    min = test[j][i];
                }
            }
            System.out.println("Minimum of column " + i + " is: " + min);
        }
    }
}
