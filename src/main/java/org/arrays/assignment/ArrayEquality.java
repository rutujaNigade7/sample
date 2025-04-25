package org.arrays.assignment;

public class ArrayEquality {

    public static void main(String args[]){

        int arr1[] = new int[]{1,2,3,4};
        int arr2[] = new int[]{1,2,3,4};

        int flag = 1;

        if(arr1.length != arr2.length){
            System.out.println("Arrays are not equal");

        }else{
            for(int i=0; i<arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("Arrays are equal");
            }else{
                System.out.println("Arrays are not equal");
            }
        }
    }
}
