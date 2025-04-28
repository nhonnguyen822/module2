package study.enity;

import study.common.KieuThue;

import java.util.Objects;

public class Facility {
    private String maDV;
    private String tenDV;
    private double dienTichSuDung;
    private int chiPhiThue;
    private int soLuongNguoiToiDa;
    private KieuThue kieuThue;

    public Facility() {
    }

    public Facility(String maDV, String tenDV, double dienTichSuDung, int chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(int dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public KieuThue getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(KieuThue kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return
                "maDV='" + maDV + '\'' +
                        ", tenDV='" + tenDV + '\'' +
                        ", dienTichSuDung=" + dienTichSuDung +
                        ", chiPhiThue=" + chiPhiThue +
                        ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                        ", kieuThue=" + kieuThue
                ;
    }

    public String convertToString() {
        return this.maDV + "," + this.tenDV +"," + this.dienTichSuDung +"," +
                this.chiPhiThue + "," +this.soLuongNguoiToiDa +"," + this.kieuThue;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Facility facility = (Facility) object;
        return Double.compare(dienTichSuDung, facility.dienTichSuDung) == 0 && chiPhiThue == facility.chiPhiThue
                && soLuongNguoiToiDa == facility.soLuongNguoiToiDa && Objects.equals(maDV, facility.maDV)
                && Objects.equals(tenDV, facility.tenDV) && kieuThue == facility.kieuThue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDV, tenDV, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
    }
}
