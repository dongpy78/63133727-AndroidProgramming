package com.buivandong.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
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
        dsPlaced.add(new TravelListData("Tháp Trầm Hương", "Tháp Trầm Hương là một công trình kiến trúc biểu tượng của Nha Trang, Khánh Hòa. Tòa tháp nằm tại Quảng trường 2/4 dọc theo đường Trần Phú và gần Trung tâm văn hoá Khánh Hòa.", R.drawable.sdfsdf_12, 5.0f));
        dsPlaced.add(new TravelListData("Vịnh Hạ Long", "Vịnh Hạ Long là quần thể danh lam thắng cảnh của tỉnh Quảng Ninh bao gồm gần 2000 hòn đảo lớn nhỏ. Riêng khu vực được UNESCO công nhận là Di sản thế giới ", R.drawable.canh_dep_ha_long_viet_nam_055419665, 5.0f));
        dsPlaced.add(new TravelListData("Ninh Bình", "Ninh Bình được biết đến là nơi có nguồn tài nguyên du lịch phong phú với nhiều di tích lịch sử, văn hóa, danh lam thắng cảnh nổi tiếng rất có giá trị.", R.drawable.canh_dep_ninh_binh_viet_nam_055419852, 5.0f));
        dsPlaced.add(new TravelListData("Phú Quốc", "Phú Quốc là hòn đảo lớn nhất của Việt Nam. Phú Quốc cùng với các hòn đảo khác tạo thành huyện đảo Phú Quốc thuộc tỉnh Kiên Giang.", R.drawable.phuquoc, 5.0f));
        dsPlaced.add(new TravelListData("Xóm Rớ", "xóm Rớ Phú Yên được biết đến là thiên đường rêu xanh nằm trên địa phận Đông Tác, phường Phú Đông, thành phố Tuy Hòa.", R.drawable.ke_chan_song_xom_ro_2, 5.0f));
        dsPlaced.add(new TravelListData("Phong Nha - Kẻ Bàng", "Nổi tiếng là một trong những kỳ quan thiên nhiên thế giới quy mô nhất tại Việt Nam hiện nay, thuộc địa phận tỉnh Quảng Bình", R.drawable.phong_nha_999, 5.0f));

        TravelAdapter adapter = new TravelAdapter(this, dsPlaced);
        listViewPlaced.setAdapter(adapter);

        listViewPlaced.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TravelListData travelListData = dsPlaced.get(i);
                Toast.makeText(PlacedToGo.this, travelListData.getHeading(), Toast.LENGTH_SHORT).show();
            }
        });

        listViewPlaced.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TravelListData travelListData = dsPlaced.get(i);
                Intent intent = new Intent(PlacedToGo.this, TravelVietNamDetails.class);
                String heading = travelListData.getHeading();
                String description = travelListData.getDescription();
                String img = String.valueOf(travelListData.getImage());
                String rating = String.valueOf(travelListData.getRating());

                intent.putExtra("heading_id", heading);
                intent.putExtra("desc_id", description);
                intent.putExtra("img_id", img);
                intent.putExtra("rating_id", rating);

                startActivity(intent);

            }
        });



    }
}