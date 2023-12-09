package com.example.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

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
        Toast.makeText(this, "Login button clicked\nMethod not yet implemented", Toast.LENGTH_LONG).show();
    }

    public void onGuestButton(View view) {
        Toast.makeText(this, "Continue as guest button clicked\nMethod not yet implemented", Toast.LENGTH_LONG).show();
    }
}