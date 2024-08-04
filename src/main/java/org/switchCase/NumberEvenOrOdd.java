package org.switchCase;
import java.util.*;
public class NumberEvenOrOdd {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter num : ");
        int num = sc.nextInt();

        int flag=0;

        if(num%2==0){
            flag=1;
        }

        switch(flag){
            case 1:
                System.out.println("even");
break;
            case 0:
                System.out.println("odd");
break;
            default : System.out.println("wrong input");

        }
    }
}
