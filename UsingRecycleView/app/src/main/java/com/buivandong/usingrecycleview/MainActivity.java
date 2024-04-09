package com.buivandong.usingrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> listRecycleData;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 3
        listRecycleData = getDataForRecycleView();
        // 4
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        // 5
        // RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        // recyclerViewLandScape.setLayoutManager(layoutLinear);
        // RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        // recyclerViewLandScape.setLayoutManager(layoutLinearHorizonal);

        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        recyclerViewLandScape.setLayoutManager(layoutGrid);
        // 6
        landScapeAdapter = new LandScapeAdapter(this, listRecycleData);
        // 7
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }

    //
    ArrayList<LandScape> getDataForRecycleView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("anh1", "Phú Yên Quê Tôi!");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("anh2", "Nha Trang Nơi Tôi Học!"));
        dsDuLieu.add(new LandScape("anh3", "Nha Trang Nơi Tôi Học!"));
        dsDuLieu.add(new LandScape("anh4", "Nha Trang Nơi Tôi Học!"));
        dsDuLieu.add(new LandScape("anh5", "Nha Trang Nơi Tôi Học!"));
        return dsDuLieu;
    }



}