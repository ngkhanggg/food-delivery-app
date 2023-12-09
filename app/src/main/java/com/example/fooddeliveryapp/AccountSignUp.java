package com.example.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fooddeliveryapp.Backend.UserTypes.*;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AccountSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_sign_up);
    }

    public void onSignUp(View view) {
        Intent intent = getIntent();

        EditText usernameField = findViewById(R.id.editTextUsername);
        EditText emailField = findViewById(R.id.editTextEmail);
        EditText passwordField = findViewById(R.id.editTextPassword);

        String role = intent.getStringExtra("role");
        assert role != null;
        String str_username = usernameField.getText().toString();;
        String str_email = emailField.getText().toString();
        String str_password = passwordField.getText().toString();

        DatabaseReference database = FirebaseDatabase.getInstance().getReference();;

        if (role.equals("Customer")) {
            Customer newAccount = new Customer(str_username, str_email, str_password, role);
            database.child("Accounts").child("Customers").child(str_username).setValue(newAccount);
        }
        else if (role.equals("Driver")) {
            Driver newAccount = new Driver(str_username, str_email, str_password, role);
            database.child("Accounts").child("Drivers").child(str_username).setValue(newAccount);
        }
        else {
            Restaurant newAccount = new Restaurant(str_username, str_email, str_password, role);
            database.child("Accounts").child("Restaurants").child(str_username).setValue(newAccount);
        }

        Toast.makeText(this, "Sign up successfully", Toast.LENGTH_LONG).show();
        finish();
    }
}