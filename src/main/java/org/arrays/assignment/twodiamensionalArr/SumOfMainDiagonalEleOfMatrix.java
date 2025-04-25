package org.arrays.assignment.twodiamensionalArr;

public class SumOfMainDiagonalEleOfMatrix {

    public static void main(String args[]){

        int test[][] = new int[][]{{1,2},{3,4}};
        int sum =0;


        for(int i=0;i<test.length;i++){
            for(int j=0;j<test[i].length;j++){
                if(i==j)
                    sum+=test[i][j];
            }
        }

        System.out.println(sum);
    }
}
