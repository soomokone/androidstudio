package com.example.sumokwon;


public class SampleData {

    //public ArrayList SampleData;

    SampleData(String a_name, String a_city,String a_price,String a_address, String a_link){
        name= a_name;
        city = a_city;
        price = a_price;
        address = a_address;
        link = a_link;
    }

    public String name;
    public String city;
    public String price;
    public String address;
    public String link;



    public String getLink() {
        return link;
    }
    public String getAddress() {
        return address;
    }
    public String getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }


    public void setAddress(String a_address) {address = a_address;}
    public void setLink(String a_link) {
        link = a_link;
    }

    public void setName(String a_name) {name = a_name;}
    public void setCity(String a_city) {city = a_city;}
    public void setPrice(String a_price) {price = a_price;    }



}