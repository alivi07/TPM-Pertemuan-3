package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<modelPahlawan> pahlawans = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.pahlawanku);
        recyclerView.setHasFixedSize(true);
        pahlawans.addAll(dataPahlawan.getListData());

        showRecyclerList();
    }

    private  void  showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterPahlawan Adapterpahlawan = new adapterPahlawan(this);
        Adapterpahlawan.setPahlawan(pahlawans);
        recyclerView.setAdapter(Adapterpahlawan);
    }
}
