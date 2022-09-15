package com.example.profile_phvy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
                TextView username =(TextView) findViewById(R.id.username);
                TextView password =(TextView) findViewById(R.id.password);
                TextView signupSwitch = findViewById(R.id.signup);

                MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

                //admin and admin

                loginbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                            //correct
                            Toast.makeText(SigninActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SigninActivity.this, MainActivity.class));
                        }else
                            //incorrect
                            Toast.makeText(SigninActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
                    }
                });

                signupSwitch.setOnClickListener(v -> {
                    startActivity(new Intent(SigninActivity.this, Signup_Activity.class));
                });
            }
        }