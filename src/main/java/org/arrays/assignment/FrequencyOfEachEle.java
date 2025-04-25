package org.arrays.assignment;

public class FrequencyOfEachEle {

    public static void main(String args[]){

        int arr[] = new int[]{1,2,3,2,1};
        int count =1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 999){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        arr[j] = 999;
                    }
                }
                System.out.println(arr[i] + "="+ count);
                count = 1;
            }
        }
    }
}
