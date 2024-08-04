package org.example;

public class swap {
    int a, b;

   void swapNumber(swap s){
        int temp;
        temp = s.b;
        s.b = s.a;
        s.a = temp;
    }
    public static void main(String args[]){
        swap s =new swap();
        s.a = 10;
        s.b = 20;

        System.out.println(s.a + " " + s.b);
        s.swapNumber(s);

        System.out.println(s.a + " " + s.b);


    }
}
