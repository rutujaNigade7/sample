package org.arrays.assignment;

import java.util.Arrays;

public class AvgArr {

    public static int avg(int a[]){
        int avgInt = 0;
        return avgInt;
    }

    public static double avg(double a[]){
        double avgDou = 4.44;
        return avgDou;
    }

    public static void main(String args[]){

        int a[] = new int[]{1,2,3};
        double b[] = new double[]{1.11,2.22};

        System.out.println(AvgArr.avg(a));
        System.out.println(AvgArr.avg(b));
        a[2] = 4;

        System.out.println(Arrays.toString(a));
    }
}
