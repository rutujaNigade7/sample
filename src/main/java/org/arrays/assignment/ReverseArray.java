package org.arrays.assignment;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String args[]) {

        int arr[] = new int[]{1, 2, 3, 4};
        int len = arr.length;
        int temp;

        System.out.println(Arrays.toString(arr));

        for (int i = 0,j=(len-1); i < (len/2); i++,j--) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }
        System.out.println("Reversed array : ");
        System.out.println(Arrays.toString(arr));

    }
}
