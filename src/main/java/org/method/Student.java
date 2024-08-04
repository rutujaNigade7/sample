package org.method;

public class Student {
    int rollNo;
    String name;

    void data(int rollNo,String name)
    {
        this.rollNo=rollNo;
        this.name=name;
    }

    Student update(Student s1)
    {
        s1.rollNo=2;
        return s1;

    }

    void display(Student s2)
    {
        System.out.println(s2.rollNo);
        System.out.println(s2.name);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student s1=new Student();

        s1.data(1,"tqpp");
        System.out.println(s1.rollNo);
        System.out.println(s1.name);

        Student s2=s1.update(s1);

        s1.display(s2);

    }
}
