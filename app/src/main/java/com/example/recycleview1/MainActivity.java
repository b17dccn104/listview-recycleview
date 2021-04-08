package com.example.recycleview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView recyclerView;
    private ArrayList<Nhanvien> listNhanvien;
    private NhanvienRecyclerViewAdapter adapter;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        listNhanvien = getAllNhanvien();
        adapter = new NhanvienRecyclerViewAdapter(this);
        adapter.setData(listNhanvien);
        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private ArrayList<Nhanvien> getAllNhanvien(){
        ArrayList<Nhanvien> list = new ArrayList<>();
        list.add(new Nhanvien(R.drawable.ic_launcher_background, "NV A", "NV01", "HC-NS"));
        list.add(new Nhanvien(R.drawable.ic_launcher_background, "NV A", "NV02", "HC-NS"));
        list.add(new Nhanvien(R.drawable.ic_launcher_background, "NV A", "NV03", "HC-NS"));
        list.add(new Nhanvien(R.drawable.ic_launcher_background, "NV A", "NV04", "HC-NS"));
        list.add(new Nhanvien(R.drawable.ic_launcher_background, "NV A", "NV05", "HC-NS"));
        list.add(new Nhanvien(R.drawable.ic_launcher_background, "NV A", "NV06", "HC-NS"));
        list.add(new Nhanvien(R.drawable.ic_launcher_background, "NV A", "NV07", "HC-NS"));
        list.add(new Nhanvien(R.drawable.ic_launcher_background, "NV A", "NV08", "HC-NS"));
        return list;
    }

    @Override
    public void onClick(View v) {
        if(v == btnAdd){
            listNhanvien.add(new Nhanvien(R.drawable.ic_launcher_foreground, "NV F", "NV01", "HC-NS"));
            adapter.setData(listNhanvien);
        }
    }
}