package org.switchCase;

public class FallThrough {

    public static void main(String args[]){
        char c = 'b';

        switch(c){
            case 'a' :System.out.println("a");
            case 'b':System.out.println("b");
            case 'c':System.out.println("c");
                System.out.println("last case");

            default:
                System.out.println("default");
        }

        char a = 'A';

        switch(a){
            case 67 : System.out.println("int");
            break;
            case 65: System.out.println("char");
            break;
            default:
                System.out.println("default");
        }



    }
}
