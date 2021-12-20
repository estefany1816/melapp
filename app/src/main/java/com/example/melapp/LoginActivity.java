package com.example.melapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnEntrarLogin = findViewById(R.id.btnEntrarLogin);
        btnEntrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        Button btnCadastrarLogin = findViewById(R.id.btnCadastrarLogin);
        btnCadastrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,Faca_CadastroActivity.class);
                startActivity(i);
            }
        });

    }


}

