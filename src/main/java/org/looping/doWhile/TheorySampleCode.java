package org.looping.doWhile;
import java.util.*;
public class TheorySampleCode {

    public static void main(String args[]){

        int i=1,j=1;

        while(i<=2){
            j=1;
            while(j<=10){
                System.out.println(i*j);
                j++;
            }
            i++;
            System.out.println();
            System.out.println();
        }

        for(char ch='a';ch<='z';ch++){
            System.out.print(ch+ " ");
        }
    }
}
