package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LoginSubmit(View view) {
        Log.i("Info", "Clicked Submit Button");
        EditText un = findViewById(R.id.username);
        String UserNameEntered = un.getText().toString();
        Log.i( "INFO", "UserName entered is " + UserNameEntered);
        EditText pw = findViewById(R.id.password);
        String PassWordEntered = pw.getText().toString();
        Log.i("INFO", "Password entered is " + PassWordEntered);

        Intent UserConfirmationActivityIntent = new Intent(getApplicationContext(), UserConfirmationActivity.class);
        UserConfirmationActivityIntent.putExtra("username", UserNameEntered);
        UserConfirmationActivityIntent.putExtra("password", PassWordEntered);
        startActivity(UserConfirmationActivityIntent);
    }
}