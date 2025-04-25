package org.arrays.assignment;
import java.util.*;

public class MissingEle {

    public static void main(String args[]) {
        int arr[] = new int[100];
        int i;

        for (i = 0; i < arr.length; i++) {
            if (i + 1 == 6 || i + 1 == 34 || i + 1 == 56)
                continue;
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        int count = 1;
        for (i = 0; i < arr.length; i++) {
            if (count == arr[i]) {
                count++;
                continue;
            } else {
                System.out.println(count);
                count++;
            }
        }
    }
}
