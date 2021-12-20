package com.example.melapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Faca_CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faca_cadastro_activity);



        Button btnCadastrarCadastro = findViewById(R.id.btnCadastrarCadastro);
        btnCadastrarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Faca_CadastroActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}