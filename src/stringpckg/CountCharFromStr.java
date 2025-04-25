package org.stringpckg;

public class CountCharFromStr {

    public static void main(String args[]){

        String str = "Hello @Java 1World";

        //char ch[] = str.toCharArray();
        int u=0 , l=0, d=0, s=0, n=0;

        for(int i=0; i<str.length(); i++){
             char c = str.charAt(i);
                if(Character.isUpperCase(c))
                    u++;
                else if(Character.isLowerCase(c))
                    l++;
                else if(Character.isDigit(c))
                    d++;
                else if(Character.isWhitespace(c))
                    s++;
                else
                    n++;
        }

        System.out.println("Upper case : " + u + " Lower case : " + l + " Digits : " + d + " Special char : " + n + " White space : " + s);
    }
}
