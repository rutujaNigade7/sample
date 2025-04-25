package org.arrays.assignment;

public class ThreeDiamensionalArray {

    public static void main(String args[]){

        int test[][][] = new int[][][]{
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {10,11,12,13},
                        {14},
                        {16,17,18}
                }
        };

        System.out.println("Length of first dimension: " + test.length);
        System.out.println("Length of second dimension: " + test[0].length);

        for(int[][] array2D : test){
            for(int[] array1D : array2D){
                for(int item : array1D){
                    System.out.print(item + " ");
                }
            }
        }
    }
}
