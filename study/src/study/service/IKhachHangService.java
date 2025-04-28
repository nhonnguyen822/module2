package study.service;

import study.enity.KhachHang;


public interface IKhachHangService extends IService<KhachHang> {
    void edit(KhachHang khachHang,String maKH);
}
