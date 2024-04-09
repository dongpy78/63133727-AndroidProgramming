package com.buivandong.listviewsecond;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh1));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh2));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh3));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh4));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh7));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh6));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh8));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh9));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh1));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh2));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh3));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh4));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh7));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh6));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh8));
        items.add(new Item("Van Dong", "vandong78py@gmail.com", R.drawable.anh9));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}