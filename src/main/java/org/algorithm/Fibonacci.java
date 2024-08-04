package org.algorithm;

public class Fibonacci {

    public static void main(String args[]){

        int num1 = 0;
        int num2 = 1;
        int temp;

        System.out.print(num1 + "," + num2 + ",");

        while(num2 < 10){
            System.out.print(num2+ ",");
            temp = num1+num2;
            num1 = num2;
            num2 = temp;

        }
    }
}
