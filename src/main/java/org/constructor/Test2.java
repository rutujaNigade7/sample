package org.constructor;

public class Test2 {

    public long accoutNo;
    public String customerName;

    Test2()
    {
        accoutNo=101;
        customerName="tqpp";
        System.out.println("I am in default constructor");
    }

    Test2(int id,String name)
    {
        accoutNo=id;
        customerName=name;
        System.out.println("I am in parametrized constructor");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Test2 obj=new Test2();
        System.out.println(obj.accoutNo+" "+obj.customerName);

        Test2 obj1=new Test2();
        System.out.println(obj1.accoutNo+" "+obj1.customerName);

        Test2 obj2=new Test2(1,"neha");
        System.out.println(obj2.accoutNo+" "+obj2.customerName);

    }

}
