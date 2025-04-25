package org.staticAndFinalTest.assignment;

public class Employee {
    int eid;
    String name;
    int salary;
    static int count = 0;

    public Employee(int id, String n, int sal){
        eid = id;
        name = n;
        salary = sal;
        count++;
    }

    static int totalEmp(){
        return count;
    }
    void display(Employee e){
        System.out.println(e.eid+" "+e.name+" "+e.salary);
    }

    public static void main(String args[]){
        Employee e1 = new Employee(1,"radhika",10000);
        Employee e2 = new Employee(2,"priya",40000);
        Employee e3 = new Employee(3,"reshma",30000);
        Employee e4 = new Employee(4,"prachi",20000);

        e1.display(e1);
        e2.display(e2);
        e3.display(e3);
        e4.display(e4);

        System.out.println("total emp : "+Employee.totalEmp());


    }
}
