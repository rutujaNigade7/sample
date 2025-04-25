package org.arrays.assignment;

public class LessThanZero {

    public static void main(String args[]){

        int a[] = new int[]{0,-1,4,-2};
int count = 0;
        for(int i : a){
            if(i<0) {
                count++;
                System.out.println(i);
            }
        }

        System.out.println("count : "+count);
    }
}
