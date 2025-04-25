package org.arrays.assignment;
import java.util.Arrays;
public class SecondSmallestEle {

    public static void main(String args[]){

        int arr[] = new int[]{2,5,1,6,7};
        int temp;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("sorted array : "+ Arrays.toString(arr));
        System.out.println("second smallest element : "+arr[1]);

        int arr1[] = new int[]{4,3,1,6,8};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("second smallest element : "+arr1[1]);

    }
}
