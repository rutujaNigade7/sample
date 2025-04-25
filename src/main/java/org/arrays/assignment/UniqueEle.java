package org.arrays.assignment;

import java.util.Arrays;

public class UniqueEle {


    public static void main(String args[]){

        int arr[] = new int[]{10,30,30,30,30};
        int temp , count=1;

        System.out.println(Arrays.toString(arr));
        System.out.println("Unique elements are : ");

        for(int i=0;i<arr.length;i++){
            temp = arr[i];
            if(temp != 999){
                for(int j=i+1; j<arr.length; j++){
                    if(temp == arr[j]){
                        count++;
                        arr[j] = 999;
                    }
                }
                if(count ==1)
                    System.out.println(arr[i]);
                arr[i] = 999;
                count =1;
            }
        }
    }



}
