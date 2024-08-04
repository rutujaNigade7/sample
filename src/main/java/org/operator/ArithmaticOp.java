package org.operator;

public class ArithmaticOp {

    public static void main(String args[]) {
        System.out.println(10*10/5+3-1*4/2);

        char op = '+';
        int a =3,b=2;

        int n = (op == '+')? a+b : (op == '-')? a-b : (op=='*')? a*b : 0;
        System.out.println(n);
    }

}
