package org.stringpckg.assignment;
import java.util.*;
public class firstOccOfChar {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();

        System.out.println("Enter a character");
        char c = sc.next().charAt(0);

        int i = s.indexOf(c);
        if(i == -1){
            System.out.println("Character not found");
        }else{
            System.out.println("First occurrence of character " + c + " is at index " + i);
        }

        int flag = 0, j;
        for(j=0; j<s.length(); j++) {
            char ch = s.charAt(j);
            if (ch == c) {
                flag = 1;
                System.out.println("First occurrence of character " + c + " is at index " + j);
                break;
            }
        }

            if(flag == 0)
                System.out.println("Character not found");


    }
}
