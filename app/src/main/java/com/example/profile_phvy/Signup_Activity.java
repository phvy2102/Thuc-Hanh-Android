package com.example.profile_phvy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Signup_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView signinSwtich = findViewById(R.id.login);

        signinSwtich.setOnClickListener(v -> {
            startActivity(new Intent(this, SigninActivity.class));
        });
    }
}