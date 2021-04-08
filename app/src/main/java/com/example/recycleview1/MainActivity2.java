package com.example.recycleview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ArrayList<Nhanvien> listNhanvien;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listNhanvien = getAllNhanvien();
        listView = findViewById(R.id.listView);
        NhanvienListViewAdapter adapter = new NhanvienListViewAdapter(this, listNhanvien);
        listView.setAdapter(adapter);

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
}