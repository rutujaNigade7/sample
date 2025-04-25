package org.stringpckg;

public class StringConstantPool {

    public static void main(String args[]){

        String s3 = "hello";
        String s = "Hello";
        String s1 = new String("Hello");

        System.out.println("SCP s3 : " + System.identityHashCode(s3));
        System.out.println("SCP s : " + System.identityHashCode(s));
        System.out.println("Heap Mem s1 : " + System.identityHashCode(s1));

        /*String s2 = s.toLowerCase();
        System.out.println("s2 string : "+ s2);

        System.out.println("s2 : " + System.identityHashCode(s2));*/

        s = s.toLowerCase();
        System.out.println("s string to lower case : " + System.identityHashCode(s));
    }
}
