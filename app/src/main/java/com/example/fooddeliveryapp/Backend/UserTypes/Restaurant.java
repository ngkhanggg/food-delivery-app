package com.example.fooddeliveryapp.Backend.UserTypes;

public class Restaurant extends User {
    public Restaurant() {
        super();
    }

    public Restaurant(String username, String email, String password, String role) {
        super(username, email, password, role);
    }
}
