package org.arrays.assignment;

import java.util.Arrays;

public class Sorting {

    public static void main(String args[]){

        int arr[] = new int[]{5,1,2,6};
        int temp;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
