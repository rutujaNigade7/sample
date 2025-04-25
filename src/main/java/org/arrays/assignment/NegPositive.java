package org.arrays.assignment;

import java.util.Arrays;

public class NegPositive {

    public static void main(String args[]){

        int arr[] = new int[]{-1,2,-3,4};

        int arr1[] = new int[arr.length];

        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr1[j] = arr[i];
                arr[i]=0;
                j++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr1[j] = arr[i];
                arr[i]=0;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
}
