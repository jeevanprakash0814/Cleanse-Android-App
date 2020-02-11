package com.jeevan.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private ImageButton signInButton;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signInButton = (ImageButton) findViewById(R.id.imageButton);
        signInButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                openMainActivity();
            }
        });

        textInputEmail = findViewById(R.id.text_input_email);
        textInputPassword = findViewById(R.id.text_input_password);
    }

    public void confirmInput(View v)
    {

    }

    public void openMainActivity()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
