package study.enity;

import study.common.GioiTinh;
import study.common.TrinhDo;
import study.common.ViTri;

import java.time.LocalDate;

public class NhanVien extends Person {
    private TrinhDo trinhDo;
    private ViTri viTri;
    private int Luong;

    public NhanVien() {
    }

    public NhanVien(TrinhDo trinhDo, ViTri viTri, int luong) {
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        Luong = luong;
    }

    public NhanVien(String ma, String ten, LocalDate ngaySinh, GioiTinh gioiTinh, String soCMND,
                    String soDT, String email, TrinhDo trinhDo, ViTri viTri, int luong) {
        super(ma, ten, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        Luong = luong;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int luong) {
        Luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                super.toString() +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", Luong=" + Luong +
                '}';
    }

    public String convertToString() {
        return super.getMa() + ","+super.getTen() + ","+super.getNgaySinh() + ","+super.getGioiTinh() +
                ","+ super.getSoCMND() + ","+super.getSoDT() +","+ super.getEmail() +","+ this.getTrinhDo() +
                ","+ this.getViTri() + ","+this.getLuong();
    }
}
