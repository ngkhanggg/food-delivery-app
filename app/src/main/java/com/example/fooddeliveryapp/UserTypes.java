package com.example.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserTypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_types);
    }

    public void onCustomerClick(View view) {
        System.out.println("Signing up for a customer account");

        Intent intent = new Intent(getApplicationContext(), AccountSignUp.class);
        intent.putExtra("role", "Customer");
        startActivityForResult(intent, 0);

        finish();
    }

    public void onDriverClick(View view) {
        System.out.println("Signing up for a driver account");

        Intent intent = new Intent(getApplicationContext(), AccountSignUp.class);
        intent.putExtra("role", "Driver");
        startActivityForResult(intent, 0);

        finish();
    }

    public void onRestaurantClick(View view) {
        System.out.println("Signing up for a restaurant account");

        Intent intent = new Intent(getApplicationContext(), AccountSignUp.class);
        intent.putExtra("role", "Restaurant");
        startActivityForResult(intent, 0);

        finish();
    }
}