package org.algorithm;
import java.util.*;
public class Display {

    public static void main(String args[]){
        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Two numbers are : a = "+ a + "& b = " + b);
        System.out.println("Addition of numbers : "+ (a+b));

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : a = "+ a + " & b = " + b);

        int sum=0;
        for(int i=1;i<=5;i++){
            sum +=i;
        }
        System.out.println("Sum of 1 to 5 numbers : "+sum);

        //print number from 5 to 1

        for(int j=5;j>=1;j--){
            System.out.print(j+" ");
        }

        System.out.println();
        //print even number from 1 to 50

        for(int i=1;i<=50;i++){
            if(i%2==0)
                System.out.print(i+",");
        }
    }
}
