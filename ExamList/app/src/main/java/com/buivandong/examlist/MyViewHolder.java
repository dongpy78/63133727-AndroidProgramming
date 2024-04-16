package com.buivandong.examlist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView headingView;
    TextView timeView;
    TextView graduateView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        headingView = itemView.findViewById(R.id.title_heading);
        timeView = itemView.findViewById(R.id.title_time);
        graduateView = itemView.findViewById(R.id.title_graduate);
    }
}
