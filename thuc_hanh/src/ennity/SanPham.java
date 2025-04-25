package ennity;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String maSP;
    private String tenSP;
    private int priceSP;
    private  String hangSX;
    private String moTaSP;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int priceSP, String hangSX, String moTaSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.priceSP = priceSP;
        this.hangSX = hangSX;
        this.moTaSP = moTaSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getPriceSP() {
        return priceSP;
    }

    public void setPriceSP(int priceSP) {
        this.priceSP = priceSP;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getMoTaSP() {
        return moTaSP;
    }

    public void setMoTaSP(String moTaSP) {
        this.moTaSP = moTaSP;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", priceSP=" + priceSP +
                ", hangSX='" + hangSX + '\'' +
                ", moTaSP='" + moTaSP + '\'' +
                '}';
    }
}

