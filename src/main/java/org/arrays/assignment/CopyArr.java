package org.arrays.assignment;

import java.util.Arrays;

public class CopyArr {

    public static void main(String args[]){
        int a[] = new int[]{1,2,3,4};
        int b[] = new int[a.length];
        int counter = 0;
        for(int i=0;i<a.length;i++){
            b[counter] = a[i];
            counter++;
        }

        System.out.println(Arrays.toString(b));
    }
}
