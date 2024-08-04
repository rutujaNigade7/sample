package org.algorithm;
import java.util.*;
public class Palindrome {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        int num1 = num, rev=0;

        while(num1 != 0){
            int rem = num1 %10;
            rev = rev*10 +rem;
            num1 = num1/10;
        }

        if(num == rev)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}
