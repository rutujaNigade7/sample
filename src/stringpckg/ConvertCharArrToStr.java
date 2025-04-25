package org.stringpckg;

public class ConvertCharArrToStr {

    public static void main(String args[]){

        String str = null;

        char c[] = new char[]{'a','b','c','d'};

        System.out.println(str);

        str = new String(c);

        System.out.println(str);
    }
}
