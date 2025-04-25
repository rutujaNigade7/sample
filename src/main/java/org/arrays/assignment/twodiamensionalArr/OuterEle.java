package org.arrays.assignment.twodiamensionalArr;

public class OuterEle {

    public static void main(String args[]){

        int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i == 0 || i == arr.length-1 || j == 0 || j == arr[i].length-1){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
