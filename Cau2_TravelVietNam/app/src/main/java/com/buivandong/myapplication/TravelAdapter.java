package com.buivandong.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class TravelAdapter extends BaseAdapter {
    private ArrayList<TravelListData> dsTravel;
    private LayoutInflater layoutInflater;
    private Context context;

    public TravelAdapter(Context context, ArrayList<TravelListData> dsTravel) {
        this.dsTravel = dsTravel;
        this.layoutInflater = layoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {
        return dsTravel.size();
    }

    @Override
    public Object getItem(int i) {
        return dsTravel.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // View hien hanh

        if(view == null)
            view = layoutInflater.inflate(R.layout.item_list_travel, null);
        // Lay du lieu
        TravelListData travelListData = dsTravel.get(i);
        // Goi len cac dieu khien
        // tim dieu khien
//        private ImageView image;
//        private TextView headerText;
//        private TextView descriptonText;
//        private RatingBar ratingBar;

        ImageView image = (ImageView) view.findViewById(R.id.image_view_item_picture);
        TextView headerText = (TextView) view.findViewById(R.id.text_view_heading);
        TextView descriptonText = (TextView) view.findViewById(R.id.text_view_description);
        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.rating_bar);

        image.setImageResource(travelListData.getImage());
        headerText.setText(travelListData.getHeading());
        descriptonText.setText(travelListData.getDescription());
        ratingBar.setRating(ratingBar.getNumStars());

        return view;
    }
}
