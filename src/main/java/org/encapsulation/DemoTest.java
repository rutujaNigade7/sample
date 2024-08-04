package org.encapsulation;

public class DemoTest {

    public static void main(String args[]){

        Demo d = new Demo();
        System.out.println(d.getId());
        d.setAmount(10000);
        System.out.println(d.getAmount());

    }
}
