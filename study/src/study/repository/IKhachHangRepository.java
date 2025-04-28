package study.repository;

import study.enity.KhachHang;
import study.enity.NhanVien;

public interface IKhachHangRepository extends IRepository<KhachHang> {
    void edit(KhachHang khachHang ,String maKH);
}
