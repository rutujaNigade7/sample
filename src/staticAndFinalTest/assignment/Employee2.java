package org.staticAndFinalTest.assignment;

public class Employee2 {

    int eid;
    String name;
    static int count = 0;

    public Employee2(String n){
        name = n;
        eid = ++count;

    }

    public static void main(String args[]){
        Employee2 e1 = new Employee2("p1");
        Employee2 e2 = new Employee2("p2");

        System.out.println(e1.eid+" "+e1.name);
        System.out.println(e2.eid+" "+e2.name);
    }
}
