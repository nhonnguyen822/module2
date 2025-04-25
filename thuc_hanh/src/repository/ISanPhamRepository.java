package repository;

import ennity.SanPham;

import java.util.List;

public interface ISanPhamRepository {
    List<SanPham> findAll();
    void add(SanPham product);
}
