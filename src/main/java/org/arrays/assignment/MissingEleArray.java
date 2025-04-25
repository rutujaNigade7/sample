package org.arrays.assignment;

public class MissingEleArray {

    public static void main(String args[]){

        int arr[] = new int[]{1,2,4,9};
        int j = 1;

        System.out.println("Missing elements are : ");

        for (int i=0; i<arr.length; i++){
            if(arr[i] != j){
                System.out.print(j + " ");
                i--;
            }
            j++;
        }
    }
}
