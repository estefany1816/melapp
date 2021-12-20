package com.example.melapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DoeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doe_sa);

        Button btnCadastrarAnimal = findViewById(R.id.btnCadastrarAnimal);
       btnCadastrarAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DoeActivity.this, CadastrarPetActivity.class);
                startActivity(i);
            }
        });

        Button btnAnimalCadastrado = findViewById(R.id.btnAnimalCadastrado);
        btnAnimalCadastrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DoeActivity.this, PetJaCadastradoActivity.class);
                startActivity(i);
            }
        });
    }
}
