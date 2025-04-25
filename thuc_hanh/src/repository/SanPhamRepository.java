package repository;

import common.ReadAndWrite;
import ennity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository implements ISanPhamRepository {

    private static final String PRODUCT_FILE = "D:\\codegym\\module2\\thuc_hanh\\src\\data\\product.dat";

    @Override
    public List<SanPham> findAll() {
        return ReadAndWrite.readFile(PRODUCT_FILE);
    }

    @Override
    public void add(SanPham product) {
        List<SanPham> sanPhamList = new ArrayList<>();
        sanPhamList.add(product);
        ReadAndWrite.writeFile(PRODUCT_FILE, sanPhamList);
    }
}
