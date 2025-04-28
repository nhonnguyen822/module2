package study.repository;

import study.enity.NhanVien;

public interface INhanVienRepository extends IRepository<NhanVien> {
    void edit(NhanVien nhanVien,String maNV);
}
