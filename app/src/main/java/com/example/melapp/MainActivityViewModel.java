package com.example.melapp;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends ViewModel {
    List<Item> itens = new ArrayList<>();


    public MainActivityViewModel (){
        Item item1 = new Item();
        item1.categoria = "Cachorro";
        item1.desc = "Macho;3 anos;Serra";
        item1.photo = R.drawable.dog;

        Item item2 = new Item();
        item1.categoria = "Gato";
        item1.desc = "Fêmea;4 anos;Viana";
        item1.photo = R.drawable.cat;

        Item item3 = new Item();
        item1.categoria = "Hamster";
        item1.desc = "Fêmea;1 ano;Cariacica";
        item1.photo = R.drawable.hamster;

        Item item4 = new Item();
        item1.categoria = "Gato";
        item1.desc = "Macho;5 anos;Vila Velha";
        item1.photo = R.drawable.cat;

        Item item5 = new Item();
        item1.categoria = "Cachorro";
        item1.desc = "Fêmea;6 anos;Serra";
        item1.photo = R.drawable.dog;

        Item item6 = new Item();
        item1.categoria = "Gato";
        item1.desc = "Fêmea;2 anos;Vitória";
        item1.photo = R.drawable.cat;

        Item item7 = new Item();
        item1.categoria = "Calopsita";
        item1.desc = "Macho;1 ano;Guarapari";
        item1.photo = R.drawable.calopsita;

        Item item8 = new Item();
        item1.categoria = "Hamster";
        item1.desc = "Macho;2 anos;Serra";
        item1.photo = R.drawable.hamster;

        Item item9 = new Item();
        item1.categoria = "Cachorro";
        item1.desc = "Fêmea;3 anos;Fundão";
        item1.photo = R.drawable.dog;

        Item item10 = new Item();
        item1.categoria = "Calopsita";
        item1.desc = "Fêmea;3 anos;Vila Velha";
        item1.photo = R.drawable.calopsita;

        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);
        itens.add(item5);
        itens.add(item6);
        itens.add(item7);
        itens.add(item8);
        itens.add(item9);
        itens.add(item10);
    }

    public List<Item> getItens() {
        return itens;
    }
}
