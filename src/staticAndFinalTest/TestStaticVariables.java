package org.staticAndFinalTest;

public class TestStaticVariables {

    int rollno;
    String name;
    static String college = "ITC";

    TestStaticVariables(int rn, String name1){
        rollno = rn;
        name = name1;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }

    public static void main(String args[]){
        TestStaticVariables t1 = new TestStaticVariables(111,"kiyara");
        TestStaticVariables t2 = new TestStaticVariables(222,"Radha");

        t1.display();
        t2.display();
        TestStaticVariables.college = "VIIT";

        t1.display();
        t2.display();
    }

}
