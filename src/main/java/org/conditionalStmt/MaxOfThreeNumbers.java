package org.conditionalStmt;

public class MaxOfThreeNumbers {

    public static void main(String args[]){

        int a=4, b=5, c=1;

        System.out.println( (a>b)? (a>c)?a:c : (b>c)?b:c);
    }
}
