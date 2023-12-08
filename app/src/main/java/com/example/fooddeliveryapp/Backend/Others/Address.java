package com.example.fooddeliveryapp.Backend.Others;

import androidx.annotation.NonNull;

public class Address {
    private String addressLine, city, province, postalCode;

    public Address() {}

    public Address(String addressLine, String city, String province, String postalCode) {
        this.addressLine = addressLine;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @NonNull
    public String toString() {
        return String.format("%s, %s, %s %s", addressLine, city, province, postalCode);
    }
}
