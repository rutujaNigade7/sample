package org.staticAndFinalTest.additional;
import java.util.*;

public class Q1 {

    int rupees;
    int doller;
    final static  float conv = 69.2f;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rupees amount : ");
        float a = sc.nextFloat();
        System.out.println("Amount in doller : "+a/conv);

    }
}
