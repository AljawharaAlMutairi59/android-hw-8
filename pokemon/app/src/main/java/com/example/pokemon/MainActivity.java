package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ArrayList<pokemon> myPokemons = new ArrayList<>();

        pokemon p1 = new pokemon("Balbasaur", R.drawable.balbasaur, 49, 49, 318);
        pokemon p2 = new pokemon("Charmander", R.drawable.charmander, 52, 43, 309);
        pokemon p3 = new pokemon("Charmeleon", R.drawable.charmeleon, 64, 58, 405);
        pokemon p4 = new pokemon("Lvysaur", R.drawable.lvysaur, 63, 63, 405);
        pokemon p5 = new pokemon("Venusaur", R.drawable.venusaur, 82, 83, 525);

        myPokemons.add(p1);
        myPokemons.add(p2);
        myPokemons.add(p3);
        myPokemons.add(p4);
        myPokemons.add(p5);

        RecyclerView rv = findViewById(R.id.RecyclerView);


        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        myAdapter adapter =new myAdapter( myPokemons,this);
        rv.setAdapter(adapter);


    }
}