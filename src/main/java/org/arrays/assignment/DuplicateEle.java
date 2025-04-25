package org.arrays.assignment;

public class DuplicateEle {

    public static void main(String args[]){

        int arr[] = new int[]{10,20,30,10,20};
        int temp , count=1;

        for(int i=0;i<arr.length;i++){
            temp = arr[i];
            if(temp != 999){
                for(int j=i+1; j<arr.length; j++){
                    if(temp == arr[j]){
                        count++;
                        arr[j] = 999;
                    }
                }
                System.out.println("Element "+ arr[i]+"= "+count);
                arr[i] = 999;
                count =1;
            }
        }
    }
}
