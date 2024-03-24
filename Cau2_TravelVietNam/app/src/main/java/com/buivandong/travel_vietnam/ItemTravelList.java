package com.buivandong.travel_vietnam;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ItemTravelList extends AppCompatActivity {
    String heading;
    String description;
    int image;
    float rating;

    public ItemTravelList(String heading, String description, @DrawableRes int image, float rating) {
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }



    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_item_travel_list);
//    }
}