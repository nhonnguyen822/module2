package ss12.thuc_hanh.bai_tap_1.service;

import ss12.thuc_hanh.bai_tap_1.enity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product product);

    Product edit(Product product);

    void delete(int id);

    void ascendingOder(List<Product> products);

    void decreasingOder(List<Product> products);


}
