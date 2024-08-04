package org.conditionalStmt;
import java.util.*;
public class NumberOfDaysInMonth {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int year;
        String month;

        year = sc.nextInt();
        month = sc.next();

        if(month.equals("february")){
            if((year%400 ==0) || ((year%4==0) && (year%100!=0))) {
                System.out.println("leap year");
                System.out.println("days 29");
            }
            else
                System.out.println("days 28");
        }
        else if(month.equals("jan") || month.equals("mar") || month.equals("may") ||
        month.equals("july") || month.equals("aug") || month.equals("oct") || month.equals("dec")){
            System.out.println("31");
        }
        else{
            System.out.println("30");
        }
    }
}
