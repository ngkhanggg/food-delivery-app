package com.example.fooddeliveryapp.Backend.UserTypes;

public class Driver extends User {
    private String firstName, lastName;

    public Driver() {
        super();
        firstName = "";
        lastName = "";
    }

    public Driver(String username, String email, String password, String role) {
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
