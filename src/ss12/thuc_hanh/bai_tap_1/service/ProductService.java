package ss12.thuc_hanh.bai_tap_1.service;

import ss12.thuc_hanh.bai_tap_1.enity.Product;
import ss12.thuc_hanh.bai_tap_1.repository.IProductRepository;
import ss12.thuc_hanh.bai_tap_1.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private static final IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public Product edit(Product product) {
        return productRepository.edit(product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public void ascendingOder(List<Product> products) {
        productRepository.ascendingOder(products);
    }

    @Override
    public void decreasingOder(List<Product> products) {
        productRepository.decreasingOder(products);
    }
}
