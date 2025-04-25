package org.methodOverloading;

public class TypePromotion {





        int add(long a,long b)
        {
            System.out.println("long");
            return 0;
        }

        int add(short a,short b)
        {
            System.out.println("short");
            return 1;
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            TypePromotion t1=new TypePromotion();
            System.out.println(t1.add(10, 20));
        }



}
