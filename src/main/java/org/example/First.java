package org.example;

public class First {

    public static void main(String args[]){

        System.out.println("Hello World");

        int arr[] = {1,2,3,4};

        for(int temp : arr){
            System.out.print(temp+" ");
        }

        A a = new A();

        System.out.println(a.i + " " + a.j);

    }
}
