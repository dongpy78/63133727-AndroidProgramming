package com.buivandong.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        dsTravel.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_noi_viet_nam_055419712, 4.5f));
        dsTravel.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable._jf0b7075nbc1695660163415, 4.5f));
        dsTravel.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ha_long_viet_nam_055419665, 4.5f));
        dsTravel.add(new TravelListData("Phú Yên", "Phú Yên Quê tôi!", R.drawable.canh_dep_ninh_binh_viet_nam_055419852, 4.5f));

        TravelAdapter adapter = new TravelAdapter(this, dsTravel);
        lvTravelVN.setAdapter(adapter);
        lvTravelVN.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TravelListData travelListData = dsTravel.get(i);
                Toast.makeText(TravelVietNam.this, travelListData.getHeading(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}