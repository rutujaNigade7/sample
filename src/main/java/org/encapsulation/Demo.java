package org.encapsulation;

public class Demo {

    private int id;
    private String name;
    private int amount;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        if(amount<5000)
            System.out.println("insufficient");
        else
            this.amount = amount;
    }
}
