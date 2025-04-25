package service;

import ennity.SanPham;
import repository.ISanPhamRepository;
import repository.SanPhamRepository;

import java.util.List;

public class SanPhamService implements ISanPhamService {
    private static final ISanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public List<SanPham> findAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public void add(SanPham product) {
        sanPhamRepository.add(product);
    }
}
