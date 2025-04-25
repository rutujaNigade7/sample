package org.arrays.assignment.twodiamensionalArr;

public class SumOfLowerTriangularMatrix {

    public static void main(String args[]){

        int a[][] = new int[][]{{1,2},{3,4}};

        int sum =0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j || i>j)
                    sum+=a[i][j];
            }
        }

        System.out.println(sum);
    }
}
