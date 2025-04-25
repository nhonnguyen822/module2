package ss17.bai_tap.bai_tap_1.service;

import ss17.bai_tap.bai_tap_1.enity.Product;
import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product product);
    void   delete(String maKH);
}
