package org.accessmodifier;

public class Student {

    public int rollNo;
    int admissionNo;
    private int age;
    protected int courseId;

    public void doPublic(){
        System.out.println("public method");
    }

    void doDefault(){
        System.out.println("default method");
    }

    protected void doProtected(){
        System.out.println("protected method");
    }

    private void doPrivate(){
        System.out.println("private method");
    }

}
