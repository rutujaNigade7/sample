package org.stringpckg;

import java.util.Arrays;

public class StringComparison {

    public static void main(String[] args) {

        String s1 = "Test"; //scp A1
        String s2 = "Test"; //scp A1
        String s3 = new String("Test"); //heap a2
        final String s4 = s3.intern(); //scp A1
        System.out.println(s1 == s2); //true
        System.out.println(s2 == s3); //false
        System.out.println(s3 == s4); //false
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4); //true
        System.out.println(s1.equals(s2)); //true
        System.out.println(s2.equals(s3)); //true
        System.out.println(s3.equals(s4)); //true
        System.out.println(s1.equals(s4)); //true
        System.out.println(s1.equals(s3)); //true

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        //String functions
        String s="hello world";
        char c=s.charAt(1);
        System.out.println(c);  //e
        String s22=s.substring(3);
        System.out.println(s22); // lo world
        String s33=s.substring(3, 6);
        System.out.println(s33); //lo{space}
        System.out.println(s.length()); //11
        System.out.println(s.indexOf('e')); //1
        System.out.println(s.lastIndexOf('l')); //9
        String s44= s.replace('e', 'o');
        System.out.println(s44); //hollo world
        String s5[]=s.split(" ");
        System.out.println(Arrays.toString(s5)); //[hello, world]
        String s6=s.toUpperCase();
        System.out.println(s6); //HELLO WORLD
        String s7=s6.toLowerCase();
        System.out.println(s7); //hello world
        System.out.println(s.startsWith("hello")); //true

    }

}
