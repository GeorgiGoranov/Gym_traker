package com.example.gym_traker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText usernameTxt;
    EditText emailTxt;
    EditText password;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        emailTxt = findViewById(R.id.email);
        usernameTxt = findViewById(R.id.username);
        password = findViewById(R.id.password);
        registerBtn = findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(emailTxt.getText().toString().equals("test@abv.bg") && usernameTxt.getText().toString().equals("user") && password.getText().toString().equals("1111")){
                    Toast.makeText(RegisterActivity.this, "Register successful", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(RegisterActivity.this, "Invalid Register", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}