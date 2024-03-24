package com.buivandong.travel_vietnam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TravelVietNamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_viet_nam);
        setUpList();
    }

    private void setUpList() {
        ItemTravelList[] travelVietNam = {
                new ItemTravelList("Phú yên", "Phú Yên đẹp lắm", R.drawable.canh_dep_ninh_binh_viet_nam_055419852, 5),
                new ItemTravelList("Phú yên", "Phú Yên đẹp lắm", R.drawable.canh_dep_ninh_binh_viet_nam_055419852, 5),
                new ItemTravelList("Phú yên", "Phú Yên đẹp lắm", R.drawable.canh_dep_ninh_binh_viet_nam_055419852, 5),
                new ItemTravelList("Phú yên", "Phú Yên đẹp lắm", R.drawable.canh_dep_ninh_binh_viet_nam_055419852, 5),
                new ItemTravelList("Phú yên", "Phú Yên đẹp lắm", R.drawable.canh_dep_ninh_binh_viet_nam_055419852, 5),
                new ItemTravelList("Phú yên", "Phú Yên đẹp lắm", R.drawable.canh_dep_ninh_binh_viet_nam_055419852, 5),
                new ItemTravelList("Phú yên", "Phú Yên đẹp lắm", R.drawable.canh_dep_ninh_binh_viet_nam_055419852, 5),

        };
    }
}