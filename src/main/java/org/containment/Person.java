package org.containment;

public class Person {

    int id;
    String name;
    Address d;

    public Person(){
        id = 1;
        name = "Nitin";
        d = new Address();
    }

    void display(){
        System.out.println(id + " " + name +" "+ d);
    }

    public static void main(String args[]){
        Person p =new Person();
        System.out.println(p);
        System.out.println(p.hashCode());
        System.out.println(p.getClass());
        System.out.println(p.getClass().getName());
        p.display();
    }
}
