package org.stringpckg;

public class strCompare {

    public static void main(String args[]){

        String str = "RockStar";

        System.out.println("Compare To: "+str.compareTo("rockstar"));

        System.out.println("Compare to ignore case : "+str.compareToIgnoreCase("ROCKSTAR"));

        System.out.println(str.replace("Rock", "rock"));
        System.out.println(str.replace("star", "Star"));
        System.out.println(str.replaceFirst("star", "Star"));
        System.out.println(str);
    }
}
