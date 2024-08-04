package org.switchCase;
import java.util.*;
public class SwitchStringType {

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter day : ");

        String day = sc.next();

        switch(day){
            case "mon":
                System.out.println("monday");
            case "tues":
            case "wed":
            case "thur":
            case "fri":
            case "sat":
            case "sun":
                System.out.println("day in a week");
                break;
                default : System.out.println("wrong input");

        }
    }
}
