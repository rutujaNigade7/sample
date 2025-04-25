package org.containment.assignment;

public class Mydate {

    int day;
    int month;
    int year;

    public Mydate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return "[Mydate : "+ day +" "+ month +" "+ year +" ]";
    }
}
