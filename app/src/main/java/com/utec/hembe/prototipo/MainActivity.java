package com.utec.hembe.prototipo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLista;
    private RecyclerAdapter adapter;
    private List<ItemList> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initValues();
    }

    private void initViews(){
        rvLista = findViewById(R.id.rvLista);
    }
    private void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);
        items = getItems();
        adapter = new RecyclerAdapter(items);
        rvLista.setAdapter(adapter);
    }

    private List<ItemList> getItems(){
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("Interstellar","Ciencia Ficción","s/20.00","Christopher Nolan","2h44m","2014",R.drawable.imagen2));
        itemLists.add(new ItemList("Avengers","Aventura","s/ 32.20","Anthony Russo","3h22m","2019",R.drawable.imagen3));
        itemLists.add(new ItemList("Venom","Ciencia Ficción","s/ 15.50","Ruben Fleischer","1h51m","2018",R.drawable.imagen4));
        itemLists.add(new ItemList("Jocker","Thriller","s/ 21.30"," Todd Phillips","2h1m","2019",R.drawable.imagen5));
        itemLists.add(new ItemList("Coco","Animacion","s/ 12.45","Adrian Molina","1h45m","2017",R.drawable.imagen6));
        itemLists.add(new ItemList("Aquamant","Accion","s/ 16.60","James Wan","2h24m","2018",R.drawable.imagen7));
        itemLists.add(new ItemList("It","Terror","s/ 24.25","Adam Bocknek","2h9m","2017",R.drawable.imagen8));
        itemLists.add(new ItemList("Rapidos y Furiosos","Accion","s/ 18.75","D.J. Barton","2h16m","2017",R.drawable.imagen9));
        itemLists.add(new ItemList("El hombre araña","Superhéroes","s/ 23.45","Susie Jones","2h30m","2017",R.drawable.imagen10));
        return itemLists;
    }
}