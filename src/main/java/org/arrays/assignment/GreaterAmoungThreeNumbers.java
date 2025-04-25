package org.arrays.assignment;

public class GreaterAmoungThreeNumbers {

    public static void main(String args[]){

        int arr[][] = new int[][] { {104,19,99}, {23,25,99}, {4,18,27} };
        int max;

        for(int i=0;i<3;i++){
            max = arr[i][0];
            for(int j=1;j<3;j++){
                if(max > arr[i][j]);
                else
                    max = arr[i][j];
            }
            System.out.println(max);
        }

    }
}
