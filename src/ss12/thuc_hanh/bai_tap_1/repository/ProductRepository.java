package ss12.thuc_hanh.bai_tap_1.repository;

import ss12.thuc_hanh.bai_tap_1.common.DescendingOrder;
import ss12.thuc_hanh.bai_tap_1.common.AscendingOrder;
import ss12.thuc_hanh.bai_tap_1.enity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "But Chi", 10000));
        products.add(new Product(2, "Sach", 12000));
        products.add(new Product(3, "But Xoa", 5000));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Product edit(Product product) {
        return product;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(products.get(i));
                break;
            } else {
                System.out.println("Is not find ID");
            }
        }
    }

    @Override
    public void ascendingOder(List<Product> products) {
        products.sort(new AscendingOrder());
    }

    @Override
    public void decreasingOder(List<Product> products) {
        products.sort(new DescendingOrder());
    }
}
