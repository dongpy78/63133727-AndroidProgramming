package com.buivandong.travel_vietnam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TravelVietNamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_viet_nam);
        setUpList();

    }

    private void setUpList() {
        ItemTravelList[] travelVietNam = {
                new ItemTravelList("Xóm Rớ", "Địa điểm du lịch ở Phú Yên! một khung cảnh khiến chúng ta không thể làm ngơ.", R.drawable.ke_chan_song_xom_ro_2, 5),
                new ItemTravelList("Tháp Trầm Hương", "Địa điểm du lịch Nha Trang!",R.drawable._jf0b7075nbc1695660163415 , 5),
                new ItemTravelList("Vịnh Hạ Long", "Địa điểm du lịch Quảng Ninh", R.drawable.image_101_hinh_anh_ha_long_nen_tho_huu_tinh_khien_ban_phai_ngat_ngay_168035430373418, 5),
                new ItemTravelList("Động Phong Nha", "Địa điểm du lịch Quảng Bình", R.drawable.phong_nha_ke_bang_dia_diem_du_lich_viet_nam, 5),
                new ItemTravelList("Hội An", "Địa điểm du lịch Đà Nẵng!", R.drawable.pho_co_hoi_an_dia_diem_du_lich_viet_nam, 5),
                new ItemTravelList("Hà Giang", "Địa điểm du lịch Hà Giang", R.drawable.ha_giang, 5),
                new ItemTravelList("Hà Nội", "Địa điểm du lịch Hà Nội", R.drawable.ha_noi, 5),
                new ItemTravelList("Côn Đảo", "Địa điểm du lịch Vũng Tàu", R.drawable.condao, 5),
                new ItemTravelList("Phú Quốc", "Địa điểm du lịch Phú Quốc", R.drawable.phuquoc, 5),


        };
        RecyclerView recyclerView = findViewById(R.id.recycle_view_travel_vietNam);
        ItemTravelListAdapter adapter = new ItemTravelListAdapter(travelVietNam);
        recyclerView.setAdapter(adapter);
    }


}