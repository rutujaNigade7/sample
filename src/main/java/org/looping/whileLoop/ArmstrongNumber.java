package org.looping.whileLoop;
import java.util.*;
import java.lang.*;
public class ArmstrongNumber {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();

        int sum = 0, rem, power, num1=num;

        while(num !=0){
            rem= num%10;
            power = (int)Math.pow(rem,3);
            //System.out.println(power);
            sum = sum+power;
            num = num/10;
        }

        if(num1 == sum)
            System.out.println("number is armstrong number");
        else
            System.out.println("not armstrong number");
    }
}
