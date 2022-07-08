package com.example.sumokwon;


public class SampleData {

    //public ArrayList SampleData;

    SampleData(String a_name, String a_city,String a_price){
        name= a_name;
        city = a_city;
        price = a_price;
    }

    public String name;
    public String city;
    public String price;


    public String getPrice() {
        return price;
    }

    public void setPrice(String a_price) {price = a_price;    }

    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }

    public void setName(String a_name) {name = a_name;}
    public void setCity(String a_city) {city = a_city;}



}