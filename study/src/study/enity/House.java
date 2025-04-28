package study.enity;

import study.common.KieuThue;

import java.util.Objects;

public class House extends Facility {
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String maDV, String tenDV, double dienTichSuDung, int chiPhiThue,
                 int soLuongNguoiToiDa, KieuThue kieuThue, String tieuChuanPhong, int soTang) {
        super(maDV, tenDV, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        House house = (House) object;
        return soTang == house.soTang && Objects.equals(tieuChuanPhong, house.tieuChuanPhong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tieuChuanPhong, soTang);
    }
}
