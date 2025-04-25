package org.staticAndFinalTest.assignment;
import java.util.*;

public class Q1 {

    void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of intergers : ");
        int count = sc.nextInt();
        int total =0;
        System.out.println("================================");
        for(int i=0;i<count;i++){
            total = total + sc.nextInt();
        }

        System.out.print("Sum of integers : "+total);
    }

    public static void main(String args[]){
        Q1 obj = new Q1();
        obj.sum();
    }
}
