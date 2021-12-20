package com.example.melapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SistemaAdocaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_adocao);

        Button btnAdotarSistemaAdocao=  findViewById(R.id.btnAdotarSistemaAdocao);
        btnAdotarSistemaAdocao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SistemaAdocaoActivity.this, AdoteActivity.class);
                startActivity(i);
            }
        });

        Button btnDoeSistemaAdocao=  findViewById(R.id.btnDoeSistemaAdocao);
        btnDoeSistemaAdocao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SistemaAdocaoActivity.this, DoeActivity.class);
                startActivity(i);
            }
        });
    }
}