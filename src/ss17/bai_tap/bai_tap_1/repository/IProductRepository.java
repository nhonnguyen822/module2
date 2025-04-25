package ss17.bai_tap.bai_tap_1.repository;

import ss17.bai_tap.bai_tap_1.enity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void add(Product product);
    void delete(String maKH);
}
