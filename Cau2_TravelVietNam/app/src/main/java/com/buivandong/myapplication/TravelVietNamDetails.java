package com.buivandong.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class TravelVietNamDetails extends AppCompatActivity {
    private ImageView img_2;
    private ImageView img_back;
    private TextView text_heading_2;
    private TextView text_description_2;
    private RatingBar ratingBar_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_viet_nam_details);
        findViews();

        Intent intent = getIntent();
        String headingId = intent.getStringExtra("heading_id");
        String descriptionId = intent.getStringExtra("desc_id");
        String imgId = intent.getStringExtra("img_id");
        String rating_id = intent.getStringExtra("rating_id");

        img_2.setImageResource(Integer.parseInt(imgId));
        text_description_2.setText(descriptionId);
        text_heading_2.setText(headingId);
        ratingBar_2.setRating(Float.parseFloat(rating_id));


        back();

    }


    private void findViews() {
        img_2 = findViewById(R.id.image_container_2);
        text_heading_2 = findViewById(R.id.text_view_heading_2);
        text_description_2 = findViewById(R.id.text_view_description_2);
        ratingBar_2 = findViewById(R.id.rating_bar_2);
        img_back = findViewById(R.id.image_icon2);
    }

    private void back() {
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TravelVietNamDetails.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}