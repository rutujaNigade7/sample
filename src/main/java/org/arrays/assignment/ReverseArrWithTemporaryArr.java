package org.arrays.assignment;

public class ReverseArrWithTemporaryArr {

    public static void main(String args[]){

        int arr[] = new int[]{1, 2, 3, 4};
        int len = arr.length;
        int temp[] = new int[len];

        System.out.println("Original array : ");
        for(int i=0; i<len; i++){
            temp[i] = arr[i];
            System.out.print(temp[i] + " ");
        }

        System.out.println("\nReversed array : ");
        for(int i=0,j=(len-1); i<len; i++,j--){
            arr[i] = temp[j];
            System.out.print(arr[i] + " ");
        }
    }
}
