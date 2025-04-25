package org.accessmodifier2;

import org.accessmodifier.Student;
import org.accessmodifier.TQPPStudent;

public class StudentMain {

    public static void main(String[] args){
        Student stud = new Student();
        System.out.println(stud.rollNo);
        //private, default, protected are not accessible outside pkge

        stud.doPublic();

        TQPPStudent tq = new TQPPStudent();
        System.out.println(tq.rollNo);

        tq.doPublic();

        OtherPackageStudent obj = new OtherPackageStudent();
        System.out.println(obj.rollNo);
        obj.doPublic();
        obj.checkStudentMethodAccess();

    }
}
