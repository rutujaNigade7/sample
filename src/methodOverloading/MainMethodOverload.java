package org.methodOverloading;

public class MainMethodOverload {


    public static void main(String[] args){
        System.out.println("main with String[]");
        main("hello");
        main();
    }

    public static void main(String str){
        System.out.println("main with String");
    }

    public static void main(){
        System.out.println("main with no-arg");
    }
}
