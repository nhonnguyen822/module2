package study.enity;

import study.common.KieuThue;

import java.util.Objects;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, double dienTichHoBoi) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Villa(String maDV, String tenDV, double dienTichSuDung, int chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue, String tieuChuanPhong, double dienTichHoBoi) {
        super(maDV, tenDV, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString()+
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Villa villa = (Villa) object;
        return Double.compare(dienTichHoBoi, villa.dienTichHoBoi) == 0 && Objects.equals(tieuChuanPhong, villa.tieuChuanPhong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tieuChuanPhong, dienTichHoBoi);
    }
}
