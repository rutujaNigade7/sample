package org.containment.assignment;

public class Address {

    String city;
    String state;
    String country;

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String toString(){
        return city + " " + state + " " + country;
    }
}
