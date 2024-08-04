package org.constructor;

public class Person {

    int id;
    String name;

    public Person() {
        System.out.println("This is default constructor");
        id = 20;
        name = "pune";
    }

    public void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person t = new Person();
        t.display();


    }
}
