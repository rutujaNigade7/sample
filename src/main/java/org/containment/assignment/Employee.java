package org.containment.assignment;

public class Employee {
    int id;
    String name;
    int salary;
    Department dept;
    Mydate mydate;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public Department getDept() {
        return dept;
    }
    public void setDept(Department dept){
        this.dept = dept;
    }

    public Mydate getMydate() {
        return mydate;
    }
    public void setMydate(Mydate mydate){
        this.mydate = mydate;
    }

    public String toString(){
        return id+" "+name+ " "+salary+ " "+dept+ " "+mydate+" ";
    }

    public static void main(String args[]){
        Employee e = new Employee();
        e.setId(11);
        e.setName("Nitin");
        e.setSalary(10000);
        e.setDept(new Department(101,"computer"));
        e.setMydate(new Mydate(13,02,2025));

        System.out.println(e);
    }
}
