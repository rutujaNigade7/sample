package org.arrays.assignment;

import java.util.Arrays;

public class SplitEvenOdd {

    public static void main(String args[]){

        int arr[] = new int[]{1,4,5,6,8,7,10};

        int evenArr[] = new int[arr.length];
        int oddArr[] = new int[arr.length];
        int j=0,k=0;
        for(int i : arr){
            if(i%2 == 0) {
                evenArr[j] = i;
                j++;
            }
            else if(i%2 != 0){
                oddArr[k] = i;
                k++;
            }
        }

        System.out.println("Even and Odd elements Array");

        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));
    }
}
