package com.buivandong.viewpage2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> listRecycleData;
    ViewPager2 viewPage2Land;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listRecycleData = getDataForRecycleView();
        viewPage2Land = findViewById(R.id.vp2);
        landScapeAdapter = new LandScapeAdapter(this, listRecycleData);
        viewPage2Land.setAdapter(landScapeAdapter);
        viewPage2Land.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

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