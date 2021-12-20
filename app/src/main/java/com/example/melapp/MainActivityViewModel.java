package com.example.melapp;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends ViewModel {
    List<Item> itens = new ArrayList<>();


    public MainActivityViewModel (){
        Item item1 = new Item();
        item1.categoria = "Cachorro";
        item1.desc = "C";



    }
}
