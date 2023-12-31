package com.example.fooddeliveryapp.Backend.UserTypes;

import com.example.fooddeliveryapp.Backend.Others.Address;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Customer extends User {
    private String firstName, lastName;

    public Customer() {
        super();
        firstName = "";
        lastName = "";
    }

    public Customer(String username, String email, String password, String role) {
        super(username, email, password, role);
        firstName = "";
        lastName = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
