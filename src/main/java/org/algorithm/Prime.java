package org.algorithm;
//display whether number is prime or not.
import java.util.*;
public class Prime {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();
        int flag=1;
        for(int i =2; i<num; i++){
            if(num%i==0){
                flag =0;
                break;
            }
        }

        if(flag==1)
            System.out.println("Number is prime");
        else if(flag==0)
            System.out.println("Number is not prime");
    }
}
