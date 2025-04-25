package org.containment.assignment;

public class Student {

    int roll;
    String name;
    Department d;

    public static void main(String args[]){
        Student s = new Student();
        s.roll=101;
        s.name = "Nitin";
        s.d = new Department(1,"computer");
        s.d.did = 1;
        s.d.dname = "Computer";

        System.out.println(s.roll+""+s.name+""+s.d.did+""+s.d.dname);
    }
}
