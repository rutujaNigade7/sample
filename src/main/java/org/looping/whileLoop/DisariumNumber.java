package org.looping.whileLoop;
import java.util.*;
public class DisariumNumber {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();
        int num1= num, rem, sum=0, count=0;
        int num2 = num;

        while(num != 0){
           count++;
            num = num / 10;
        }
        while(num1 != 0){
            rem = num1 % 10;
            sum += (int)Math.pow(rem , count);
            count--;
            num1/=10;
        }

        if(num2 == sum){
            System.out.println("Disarium number");
        }
        else{
            System.out.println("not a disarium number");
        }
    }
}
