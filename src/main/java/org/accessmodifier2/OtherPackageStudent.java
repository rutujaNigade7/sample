package org.accessmodifier2;

import org.accessmodifier.Student;

public class OtherPackageStudent extends Student {

    void checkStudentVariableAccess(){
        rollNo = 1;
        courseId = 101;
        /*age = 20;
        admissionNo = 1101;*/ // private and default are not accessible
    }

    void checkStudentMethodAccess(){
        doPublic();
        doProtected();
        /*doDefault();
        doPrivate();*/ // private and default not accessible
    }
}
