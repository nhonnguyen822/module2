package ss12.thuc_hanh.bai_tap_1.repository;

import ss12.thuc_hanh.bai_tap_1.enity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void add(Product product);

    void edit(int id,Product product);

    void delete(int id);
    void ascendingOder(List<Product> products);
    void decreasingOder(List<Product> products);

}
