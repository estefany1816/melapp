package com.example.melapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView  = findViewById(R.id.btnViewIcones);
        //Estabelecimento dos critérios, isto é, o que acontece quando clicado nos botões de seleção
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.infogerais:
                        Intent i = new Intent(MainActivity.this, InfGeraisActivity.class);
                        startActivity(i);
                        break;

                    case R.id.sistemaAdocao:
                        Intent j = new Intent(MainActivity.this, SistemaAdocaoActivity.class);
                        startActivity(j);
                        break;

                    case R.id.testeAuxiliar:
                        Intent a = new Intent(MainActivity.this, TesteAuxiliarActivity.class);
                        startActivity(a);
                        break;
                }
                return true;
            }


        });
    };
}