package com.buivandong.examlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Item> items = new ArrayList<Item>();
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        items.add(new Item("First Exam", "⌛ 10/03/2024", "🎓 Good luck for you!"));
        items.add(new Item("Second Exam", "⌛ 10/03/2024", "🎓 Best of luck!"));
        items.add(new Item("Third Exam", "⌛ 10/03/2024", "🎓 Take care!"));
        items.add(new Item("The Next Exam", "⌛ 10/03/2024", "🎓 Try your best!"));
        items.add(new Item("The Next Exam", "⌛ 10/03/2024", "🎓 Good luck for you!"));
        items.add(new Item("The Next Exam", "⌛ 10/03/2024", "🎓 Good luck for you!"));
        items.add(new Item("The Next Exam", "⌛ 10/03/2024", "🎓 Good luck for you!"));
        items.add(new Item("The Next Exam", "⌛ 10/03/2024", "🎓 Good luck for you!"));
        items.add(new Item("The Next Exam", "⌛ 10/03/2024", "🎓 Good luck for you!"));
        items.add(new Item("The Next Exam", "⌛ 10/03/2024", "🎓 Good luck for you!"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }


}