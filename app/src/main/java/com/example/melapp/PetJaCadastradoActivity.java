package com.example.melapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class PetJaCadastradoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_ja_cadastrado);
    }

    public void startPhotoActivity(String photoPath) {
        Intent i = new Intent(PetJaCadastradoActivity.this, VisualizarFotoActivity.class);
        i.putExtra("photo_path", photoPath);
        startActivity(i);
    }
}