package com.example.recycleview1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NhanvienListViewAdapter extends ArrayAdapter {
    ArrayList<Nhanvien> listNhanvien;
    Activity activity;

    public NhanvienListViewAdapter(@NonNull Activity activity,ArrayList<Nhanvien> listNhanvien) {
        super(activity, R.layout.nhanvien_layout, listNhanvien);
        this.activity = activity;
        this.listNhanvien = listNhanvien;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = activity.getLayoutInflater().inflate(R.layout.nhanvien_layout, null, true);
        ImageView imgNV = v.findViewById(R.id.imgNV);
        TextView tenNVTV = v.findViewById(R.id.tenNV);
        TextView maNVTV = v.findViewById(R.id.maNV);
        TextView phongNVTV = v.findViewById(R.id.phongNV);
        TextView btnXoa = v.findViewById(R.id.btnXoa);

        Nhanvien nv = listNhanvien.get(position);
        imgNV.setImageResource(nv.getImgResource());
        tenNVTV.setText(nv.getTenNV());
        maNVTV.setText(nv.getMaNV());
        phongNVTV.setText(nv.getPhongNV());

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listNhanvien.remove(position);
                notifyDataSetChanged();
            }
        });
        return v;
    }
}
