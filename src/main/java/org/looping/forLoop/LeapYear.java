package org.looping.forLoop;

public class LeapYear {

    public static void main(String args[]){

        for(int i=2001 ; ; i++){
            if((i%4==0 && i%100!=0) || (i%400==0)){
                System.out.println(i);
                break;
            }
        }
    }
}
