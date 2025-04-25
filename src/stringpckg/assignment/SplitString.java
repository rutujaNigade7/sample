package org.stringpckg.assignment;

import java.util.Arrays;

public class SplitString {

    public static void main(String args[]){

        String s = "HELLO$WORLD";

        String s1[] = s.split("\\$");

        System.out.println(Arrays.toString(s1));
        int len = s1.length;
        int len1 = s.length();
    }
}
