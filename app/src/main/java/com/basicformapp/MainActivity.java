package com.basicformapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRegister(View view){

        EditText firstNameInput = findViewById(R.id.firstNameEditText);
        EditText lastNameInput = findViewById(R.id.lastNameEditText);
        EditText emailInput = findViewById(R.id.emailEditText);

        TextView firstNameOutput= findViewById(R.id.firstNameTextView);
        TextView lastNameOutput= findViewById(R.id.lastNameTextView);
        TextView emailOutput= findViewById(R.id.emailTextView);

        firstNameOutput.setText("First Name:" + firstNameInput.getText().toString());
        lastNameOutput.setText("Last Name:" + lastNameInput.getText().toString());
        emailOutput.setText("Email:" + emailInput.getText().toString());

    }
}