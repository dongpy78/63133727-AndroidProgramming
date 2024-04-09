package com.buivandong.usingrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> listData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View viewItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHolder viewholderCreated = new ItemLandHolder(viewItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        // Lấy đối tượng hiển thị
        LandScape landScapeHienThi = listData.get(position);
        // Trích thông tin
        String caption = landScapeHienThi.getLandCation();
        String tenAnh = landScapeHienThi.getLandImageFileName();
        // Đặt vào các trường thông tin của holder
        holder.textViewCaption.setText(caption);
        // Đặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenAnh, "mipmap", packageName);
        holder.imageViewLandscape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textViewCaption;
        ImageView imageViewLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            textViewCaption = itemView.findViewById(R.id.textViewCaption);
            imageViewLandscape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            // code tại đây
            int vitriDuocClick = getAdapterPosition();
            LandScape phanTuDuocClick = listData.get(vitriDuocClick);
            // bóc thông tin
            String ten = phanTuDuocClick.getLandCation();
            String tenFile = phanTuDuocClick.getLandImageFileName();
            // Toast ten
            String chuoiThongBao = "Bạn vừa click vào: " + ten;
            Toast.makeText(view.getContext(), chuoiThongBao, Toast.LENGTH_SHORT).show();
        }
    }
}
