package org.looping.doWhile;
import java.util.*;
public class Test3 {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();

        String binary= "";
        int rem;

        while(num != 0){
            rem = num % 2;
            binary = rem + binary;
            System.out.println(binary);
            num = num / 2;
        }

        System.out.println(binary);
    }
}
