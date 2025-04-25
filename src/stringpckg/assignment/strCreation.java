package org.stringpckg.assignment;

import java.util.Arrays;

public class strCreation {

    public static void main(String args[]){

        String str = "RockStar"; //scp
        String str1 = new String("Star"); //heap mem
        String str3 = new String("Star"); //heap mem

        System.out.println(str + " " + str1);

        String str2 = "RockStar"; //scp

        System.out.println("str == str2 : " + (str == str2)); //true
        System.out.println("str reference : " + System.identityHashCode(str));
        System.out.println("str2 reference : " + System.identityHashCode(str2));

        System.out.println("str1 reference : " + System.identityHashCode(str1));
        System.out.println("str3 reference : " + System.identityHashCode(str3));

        System.out.println("length of str : " +str.length());
        System.out.println("concat str with str1 :  " + str.concat(str1));

        System.out.println("compare str with str1 : " + str.compareTo(str1)); //negative value

        System.out.println("convert to uppercase : " + str.toUpperCase());

        System.out.println("copy one string to another : " + str.copyValueOf(str.toCharArray()));


    }
}
