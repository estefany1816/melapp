package com.example.melapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfGeraisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf_gerais);

        Button btnCachorroInfoGerais=  findViewById(R.id.btnCachorroInfoGerais);
        btnCachorroInfoGerais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InfGeraisActivity.this, InfGeraisAnimalActivity.class);
                startActivity(i);
            }
        });

        Button btnGatoInfoGerais=  findViewById(R.id.btnGatoInfoGerais);
        btnGatoInfoGerais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InfGeraisActivity.this, InfGeraisAnimalActivity.class);
                startActivity(i);
            }
        });

        Button btnCalopsitaInfoGerais  = findViewById(R.id.btnCalopsitaInfoGerais);
        btnCalopsitaInfoGerais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InfGeraisActivity.this, InfGeraisAnimalActivity.class);
                startActivity(i);
            }
        });


        Button btnHamsterInfoGerais=  findViewById(R.id.btnHamsterInfoGerais);
        btnHamsterInfoGerais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InfGeraisActivity.this, InfGeraisAnimalActivity.class);
                startActivity(i);
            }
        });


    }
}