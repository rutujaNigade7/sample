package org.containment.assignment;

public class Person {

    String name;
    String gender;
    int age;
    Address addr;

    Person(){
        name = "Nitin";
        gender =  "male";
        age = 10;
        addr = new Address();
    }

    public static void main(String args[]){
        Person p = new Person();
        p.addr.setCity("Pune");
        p.addr.setState("Maharashtra");
        p.addr.setCountry("India");

        System.out.println(p.name+ " " + p.gender + " "+ p.age + " "+ p.addr);
    }
}
