package ss17.bai_tap.bai_tap_1.repository;


import ss12.thuc_hanh.bai_tap_1.common.ReadAndWriteFile;
import ss17.bai_tap.bai_tap_1.common.ReadAndWrite;
import ss17.bai_tap.bai_tap_1.enity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String PRODUCT_FILE = "D:\\codegym\\module2\\src\\ss17\\bai_tap\\bai_tap_1\\data\\product.dat";


    @Override
    public List<Product> findAll() {
        return ReadAndWrite.readFile(PRODUCT_FILE);
    }

    @Override
    public void add(Product product) {
        List<Product> productList = ReadAndWrite.readFile(PRODUCT_FILE);
        productList.add(product);
        ReadAndWrite.writeFile(PRODUCT_FILE, productList);
    }

    @Override
    public void delete(String maKH) {
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getMaSP().equals(maKH)) {
                productList.remove(i);
                break;
            }
        }
        ReadAndWrite.writeFile(PRODUCT_FILE, productList);
    }
}
