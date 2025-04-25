package org.containment;

public class Address {

    String city;
    int zip;

    public Address(){
        city = "pune";
        zip = 41;
    }

    public String toString(){
        return "City= " +city+ "Zip=" +zip;
    }
}
