package org.arrays.assignment;

public class MinChar {

    public static void main(String args[]){

        char arr[] = new char[]{'A','D','D','x','y','R'};
        char min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
