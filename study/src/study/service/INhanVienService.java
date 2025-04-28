package study.service;

import study.enity.NhanVien;

public interface INhanVienService extends IService<NhanVien>{
    void edit(NhanVien nhanVien ,String maNV);
}
