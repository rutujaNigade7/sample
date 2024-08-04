package org.operator;
import java.util.*;
public class Year_Week_Days {

    public static void main(String args[]) {
        int year, week, days, m;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of days : ");
        m = sc.nextInt();

        year = m / 365;
        System.out.println("Year : " + year);

        m = m%365;

        week = m/7;
        System.out.println("Week : "+ week);

        m = m% 7;
        days = m;
        System.out.println("Days : " + days);

    }
}
