package org.containment.assignment;

public class Department {

    int did;
    String dname;

    public Department(int did, String dname){
        this.did = did;
        this.dname = dname;
    }

    public String toString(){
        return "[Dept: "+did+ " " + dname + "]";
    }
}
