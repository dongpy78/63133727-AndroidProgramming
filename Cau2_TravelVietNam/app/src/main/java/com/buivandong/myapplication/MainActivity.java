package com.buivandong.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpOnclickListenner();
    }

    private void setUpOnclickListenner() {
        CardView travelVNCard = findViewById(R.id.card_view_travelVN);
        CardView placedToGoCard = findViewById(R.id.card_view_placed);

        travelVNCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TravelVietNam.class);
                startActivity(intent);
            }
        });

        placedToGoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlacedToGo.class);
                startActivity(intent);
            }
        });
    }

}