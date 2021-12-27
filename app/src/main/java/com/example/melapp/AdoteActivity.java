package com.example.melapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class AdoteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adote_sa);

        MainActivityViewModel vm = new ViewModelProvider(this).get(MainActivityViewModel.class);
        List<Item> itens = vm.getItens();

    }

    public void startPhotoActivity(String photoPath) {
        Intent i = new Intent(AdoteActivity.this, VisualizarFotoActivity.class);
        i.putExtra("photo_path", photoPath);
        startActivity(i);
    }
}
