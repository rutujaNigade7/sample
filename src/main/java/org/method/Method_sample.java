package org.method;

public class Method_sample {

    int a=4;
    Method_sample add(Method_sample t2)
    {
        System.out.println(t2.a);
        t2.a=30;
        return t2;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Method_sample t1=new Method_sample();
        System.out.println(t1.add(t1).a);

    }
}
