package study.enity;

import study.common.GioiTinh;

import java.time.LocalDate;

public abstract class Person {
    private String ma;
    private String ten;
    private LocalDate ngaySinh;
    private GioiTinh gioiTinh;
    private String soCMND;
    private String soDT;
    private String email;

    public Person() {
    }

    public Person(String ma, String ten, LocalDate ngaySinh, GioiTinh gioiTinh,
                  String soCMND, String soDT, String email) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", soDT='" + soDT + '\'' +
                ", email='" + email + '\''
                ;
    }
}
