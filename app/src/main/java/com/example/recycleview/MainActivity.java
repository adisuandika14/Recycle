package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String Image[],Deskripsi[];
    int Images[] = {R.drawable.asus, R.drawable.acer,R.drawable.dell,R.drawable.hp,
            R.drawable.lenovo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView);

        Image = getResources().getStringArray(R.array.programming_languages);
        Deskripsi = getResources().getStringArray(R.array.description);


        MyAdapter myAdapter = new MyAdapter( this, Image, Deskripsi, Images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
