package org.ganeshjadhav.immutability;

public class Address {
    private String line;
    private String city;
    private int pincode;

    public Address(String line, String city, int pincode) {
        this.line = line;
        this.city = city;
        this.pincode = pincode;
    }

    public String getLine() {
        return line;
    }

    public String getCity() {
        return city;
    }

    public int getPincode() {
        return pincode;
    }
}
