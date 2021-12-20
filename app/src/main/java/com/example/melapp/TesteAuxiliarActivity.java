package com.example.melapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TesteAuxiliarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_auxiliar);

        Button btnResultadoTeste  = findViewById(R.id.btnResultadoTeste);
        btnResultadoTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TesteAuxiliarActivity.this, ResultadoTesteAuxiliarActivity.class);
                startActivity(i);
            }
        });
    }
}