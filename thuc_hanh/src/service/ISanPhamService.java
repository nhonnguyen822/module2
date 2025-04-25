package service;

import ennity.SanPham;

import java.util.List;

public interface ISanPhamService {
    List<SanPham> findAll();
    void add(SanPham product);
}
