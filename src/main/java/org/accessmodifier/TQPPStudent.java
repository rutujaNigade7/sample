package org.accessmodifier;

public class TQPPStudent extends Student{

    void checkStudentVariableAccess(){
        rollNo = 10;
        admissionNo = 1101;
        courseId = 11;
        //age = 20; private not accessible
    }

    void checkStudentMethodAccess(){
        doPublic();
        doDefault();
        doProtected();
        //doPrivate(); private not accessible
    }
}
