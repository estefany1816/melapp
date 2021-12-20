package com.example.melapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CadastrarPetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_animal);

        Button btnCadastrarPet  = findViewById(R.id.btnCadastrarPet);
        btnCadastrarPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CadastrarPetActivity.this, PetJaCadastradoActivity.class);
                startActivity(i);
            }
        });
    }
}
