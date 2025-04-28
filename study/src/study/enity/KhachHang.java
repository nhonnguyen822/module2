package study.enity;

import study.common.GioiTinh;
import study.common.LoaiKhachHang;

import java.time.LocalDate;

public class KhachHang extends Person {
    private LoaiKhachHang loaiKH;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(LoaiKhachHang loaiKH, String diaChi) {
        this.loaiKH = loaiKH;
        this.diaChi = diaChi;
    }

    public KhachHang(String ma, String ten, LocalDate ngaySinh, GioiTinh gioiTinh,
                     String soCMND, String soDT, String email, LoaiKhachHang loaiKH, String diaChi) {
        super(ma, ten, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.loaiKH = loaiKH;
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }



    public LoaiKhachHang getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(LoaiKhachHang loaiKH) {
        this.loaiKH = loaiKH;
    }


    @Override
    public String toString() {
        return "KhachHang{" +
                super.toString() +
                "loaiKH='" + loaiKH + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
    public String convertToString(){
        return super.getMa()+","+super.getTen()+","+super.getNgaySinh()+","+super.getGioiTinh()+","+
                super.getSoCMND()+","+super.getSoDT()+","+super.getEmail()+","+this.getLoaiKH()+","+this.getDiaChi();
    }


}
