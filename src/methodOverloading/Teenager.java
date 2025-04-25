package org.methodOverloading;

public class Teenager extends Kid{

    void readBook(){
        System.out.println("teenager method");
    }

    public static void main(String[] args){
        Kid k1,k2;

        k1=new Bigkids();
        k2=new Teenager();
        k1.readBook();
        k2.readBook();
    }
}
