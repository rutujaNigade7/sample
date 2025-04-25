package org.arrays.assignment;

public class MinMaxInArr {

    public static void main(String args[]){

        int arr[] = new int[]{20,30,1,40,99};
        int max = arr[0];
        int min = arr[0];

        for(int i : arr){
            if(max < i)
                max = i;
            if(min > i)
                min = i;
        }

        System.out.println("MAX and MIN number : "+ max + " "+ min);
    }
}
