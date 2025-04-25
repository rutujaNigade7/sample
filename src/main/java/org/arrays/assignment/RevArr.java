package org.arrays.assignment;

public class RevArr {

    public static void main(String args[]){

        int a[] = new int[]{1,2,3,4};
       // int j;
        System.out.println("Reverse array");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

        for(int j=a.length-1; j>=0; j-=2){
            System.out.println(a[j]);
        }
    }
}
