package org.stringpckg.assignment;

public class copyString {

    public static void main(String args[]){

        String s1 = "java";

        String s2 = " ";

        s2 = s1;

        System.out.println("s2 = " +s2);
        System.out.println("s1==s2" +s1==s2);
        System.out.println("s1.equals(s2)" + s1.equals(s2));

        String s3 = new String(s1);
        System.out.println("s3 = " +s3);

        System.out.println("s1==s3" +s1==s3);

        String s4 = "program";
        String s5 = "";
        System.out.println(s4.valueOf(s2));
        s5 = s4.valueOf(s2);
        System.out.println("s5 = " +s5);
        System.out.println("s4 = " +s4);

        String s6 = s4.copyValueOf(s2.toCharArray());
        System.out.println("s6 = " +s6);
        System.out.println("s4 = " +s4);
        System.out.println("s2 = " +s2);
    }
}
