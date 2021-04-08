package com.example.recycleview1;

public class Nhanvien {
    private int imgResource;
    private String tenNV;
    private String maNV;
    private String phongNV;

    public Nhanvien() {
    }

    public Nhanvien(int imgResource, String tenNV, String maNV, String phongNV) {
        this.imgResource = imgResource;
        this.tenNV = tenNV;
        this.maNV = maNV;
        this.phongNV = phongNV;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getPhongNV() {
        return phongNV;
    }

    public void setPhongNV(String phongNV) {
        this.phongNV = phongNV;
    }
}
