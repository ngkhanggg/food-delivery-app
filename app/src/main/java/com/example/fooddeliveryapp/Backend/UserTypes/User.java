package com.example.fooddeliveryapp.Backend.UserTypes;

import com.example.fooddeliveryapp.Backend.Others.Address;

public abstract class User {
    private String username, email, password, role;
    private Address address;

    public User() {
        username = "";
        email = "";
        password = "";
        role = "";
    }

    public User(String username, String email, String password, String role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Address getAddress() {
        return address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
