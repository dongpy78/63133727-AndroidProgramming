package com.buivandong.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PlacedToGo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placed_to_go);

        // Tìm listView
        ListView listViewPlaced = (ListView) findViewById(R.id.list_view_placed);
        // Dữ liệu
        ArrayList<TravelListData> dsPlaced = new ArrayList<TravelListData>();
        dsPlaced.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi! Phú Yên Quê tôi! Phú Yên Quê tôi! Phú Yên Quê tôi! ", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));
        dsPlaced.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));
        dsPlaced.add(new TravelListData("Hà Nội", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_noi_viet_nam_055419712, 4.5f));
        dsPlaced.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));
        dsPlaced.add(new TravelListData("Vịnh Hạ Long", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));
        dsPlaced.add(new TravelListData("Phong Nha - Kẻ Bàng", "Phú Yên Quê tôi!", R.drawable.phong_nha_ke_bang_dia_diem_du_lich_viet_nam, 4.5f));

        TravelAdapter adapter = new TravelAdapter(this, dsPlaced);
        listViewPlaced.setAdapter(adapter);

        listViewPlaced.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TravelListData travelListData = dsPlaced.get(i);
                Toast.makeText(PlacedToGo.this, travelListData.getHeading(), Toast.LENGTH_SHORT).show();
            }
        });




    }
}