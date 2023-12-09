package com.example.fooddeliveryapp.Backend.UserTypes;

import com.example.fooddeliveryapp.Backend.Others.Address;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Customer extends User {
    public Customer() {}

    public Customer(String username, String email, String password, String role) {
        super(username, email, password, role);
    }
}
