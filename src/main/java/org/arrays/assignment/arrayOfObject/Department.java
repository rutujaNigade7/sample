package org.arrays.assignment.arrayOfObject;

public class Department {

    int did;
    String dname;

    public Department(int did, String dname){
        this.did = did;
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}
