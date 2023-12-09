package com.example.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSignUpButton(View view) {
        System.out.println("Sign up button clicked");
        Intent intent = new Intent(getApplicationContext(), UserTypes.class);
        startActivityForResult(intent, 0);
    }

    public void onLoginButton(View view) {
        System.out.println("Login button clicked");
    }

    public void onGuestButton(View view) {
        System.out.println("Continue as guest button clicked");
    }
}