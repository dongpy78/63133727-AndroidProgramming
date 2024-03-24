package com.buivandong.travel_vietnam;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemTravelListAdapter extends RecyclerView.Adapter<ItemTravelListAdapter.ItemTravelViewHolder> {
    ItemTravelList[] entries;

    public ItemTravelListAdapter(ItemTravelList[] entries) {
        this.entries = entries;
    }

    @NonNull
    @Override
    public ItemTravelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_travel_list, parent, false);
        return new ItemTravelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemTravelViewHolder holder, int position) {
        holder.bind(entries[position], position);
    }

    @Override
    public int getItemCount() {
        return entries.length;
    }

    static class ItemTravelViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView headerText;
        private TextView descriptionText;
        private RatingBar ratingBar;
        public ItemTravelViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_view_item_picture);
            headerText = itemView.findViewById(R.id.text_view_heading);
            descriptionText = itemView.findViewById(R.id.text_view_description);
            ratingBar = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(ItemTravelList entry, int position) {
            String headerString = position + 1 + ". " + entry.heading;
            image.setImageResource(entry.image);
            headerText.setText(entry.heading);
            descriptionText.setText(entry.description);
            ratingBar.setRating(entry.rating);
        }
    }

}
