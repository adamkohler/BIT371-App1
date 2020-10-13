package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class UserConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_confirmation);
        String passWord = "1234";
        String userName = "adam";

       // Intent UserConfirmation = getIntent();
        String UserNameEntered = getIntent().getStringExtra("username");
        String PasswordEntered = getIntent().getStringExtra("password");

        Log.i("INFO", "Password passed from main_activity is " + PasswordEntered);
        Log.i("INFO", "UserName passed from main_activity is " + UserNameEntered);


        TextView tv = findViewById(R.id.textView);
        if (userName.equals(UserNameEntered) && passWord.equals(PasswordEntered)){
            tv.setText("Welcome " + UserNameEntered);
        }else
            tv.setText("Invalid Username and Password");
    }
}