package org.switchCase;
import java.util.*;
public class SimpleCal {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch;
        do{
            System.out.println("1.Add 2.Sub 3.Mul 4.Div Enter your choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1: System.out.println(a+b);
                break;
                case 2: System.out.println(a-b);
                break;
                case 3: System.out.println(a*b);
                break;
                case 4: System.out.println(a/b);
                break;
                default:System.out.println("wrong input");
                    break;
            }
            System.out.println("do you want to continue : ");
            ch = sc.next().charAt(0);
        }while(ch == 'y');
    }
}
