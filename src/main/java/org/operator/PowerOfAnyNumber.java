package org.operator;
import java.util.*;
public class PowerOfAnyNumber {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        System.out.println("Enter power : ");
        int index = sc.nextInt();

        int pow=1;

        while(index != 0){
            pow = pow * num;
            index--;
        }
        System.out.println("power is : "+pow);
    }
}
