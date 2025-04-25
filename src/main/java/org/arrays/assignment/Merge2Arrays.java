package org.arrays.assignment;

public class Merge2Arrays {

    public static void main(String args[]){

        int arr1[] = new int[]{1,2,3,4};
        int arr2[] = new int[]{2,5,6,7};
        int j=0, flag=1;

        int arr3[] = new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length; i++){
            for(int k=0; k<arr3.length; k++){
                if(arr1[i] == arr3[k]){
                    flag=0;
                    break;
                }
            }
            if(flag == 1){
            arr3[j] = arr1[i];
            j++;
            }
            flag = 1;
    }


        for(int i=0; i<arr2.length; i++){
            for(int k=0; k<arr3.length; k++){
                if(arr2[i] == arr3[k]){
                    flag=0;
                    break;
                }
            }
            if(flag == 1){
            arr3[j] = arr2[i];
            j++;
            }
            flag = 1;
        }

        System.out.println("Merged array : ");
        for(int i=0; i<j; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
