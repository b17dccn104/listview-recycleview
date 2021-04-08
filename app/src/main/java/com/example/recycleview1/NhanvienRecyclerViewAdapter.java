package com.example.recycleview1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NhanvienRecyclerViewAdapter extends RecyclerView.Adapter<NhanvienRecyclerViewAdapter.NhanvienViewHolder> {
    private Activity activity;
    private ArrayList<Nhanvien> listNV;

    public NhanvienRecyclerViewAdapter(Activity activity){
        this.activity = activity;
    }

    public void setData(ArrayList<Nhanvien> listNV){
        this.listNV = listNV;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NhanvienViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.nhanvien_layout, null, false);
        return new NhanvienViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NhanvienViewHolder holder, int position) {
        Nhanvien nv = listNV.get(position);
        holder.nhanvienImg.setImageResource(nv.getImgResource());
        holder.maNVTV.setText(nv.getMaNV());
        holder.tenNVTV.setText(nv.getTenNV());
        holder.phongNVTV.setText(nv.getPhongNV());
    }

    @Override
    public int getItemCount() {
        return (listNV.isEmpty()) ? 0 : listNV.size();
    }

    public class NhanvienViewHolder extends RecyclerView.ViewHolder {

        private ImageView nhanvienImg;
        private TextView tenNVTV;
        private TextView maNVTV;
        private TextView phongNVTV;
        private Button btnXoa;

        public NhanvienViewHolder(@NonNull View itemView) {
            super(itemView);

            nhanvienImg = itemView.findViewById(R.id.imgNV);
            tenNVTV = itemView.findViewById(R.id.tenNV);
            maNVTV = itemView.findViewById(R.id.maNV);
            phongNVTV = itemView.findViewById(R.id.phongNV);
            btnXoa = itemView.findViewById(R.id.btnXoa);

            btnXoa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listNV.remove(getAdapterPosition());
                    notifyDataSetChanged();
                }
            });
        }


    }
}
