package org.arrays.assignment;
import java.util.*;
public class OneDim {

    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int sum =0;
        for(int i =0;i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Avg of array elements : "+ (sum/arr.length));
    }
}
