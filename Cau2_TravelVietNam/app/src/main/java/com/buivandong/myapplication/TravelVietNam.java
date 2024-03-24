package com.buivandong.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TravelVietNam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_viet_nam);

        // Tìm ListView
        ListView lvTravelVN = (ListView) findViewById(R.id.list_view_travel);
        // Dữ liệu
        ArrayList<TravelListData> dsTravel = new ArrayList<TravelListData>();
        dsTravel.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));
        dsTravel.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));
        dsTravel.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));
        dsTravel.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));
        dsTravel.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));
        dsTravel.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));


    }
}