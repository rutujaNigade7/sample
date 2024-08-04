package org.constructor;

public class Course {

    int id;
    String name;
    Subcourse sc;

    Course(){
        id=1;
        name="neha";
        sc=new Subcourse();
        System.out.println("course const.");
    }

    public static void main(String args[]){
        Course c= new Course();
        System.out.println(c.id+ " "+c.name+" "+c.sc.subcourseId+" "+c.sc.subcourseName);
    }
}
