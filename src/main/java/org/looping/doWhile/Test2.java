package org.looping.doWhile;
import java.util.*;
public class Test2 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a =1, sum=0;

        do{
            int n = sc.nextInt();
            if(n>0){
                sum =sum + n;
            }
            else{
                System.out.println("pls try again");
                continue;
            }
            a++;
        }while(a<=5);
    }
}
