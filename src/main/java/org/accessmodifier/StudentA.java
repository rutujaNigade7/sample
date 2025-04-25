package org.accessmodifier;

public class StudentA {

    public static void main(String args[]){
        Student stud = new Student();

        //access data veriables
        System.out.println(stud.admissionNo +" "+ stud.courseId +" "+ stud.rollNo);
        //private data member is not accessible

        stud.doPublic();
        stud.doDefault();
        stud.doProtected();
        //stud.doPrivate(); - not accessible
    }
}
