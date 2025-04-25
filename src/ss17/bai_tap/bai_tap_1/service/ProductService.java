package ss17.bai_tap.bai_tap_1.service;

import ss17.bai_tap.bai_tap_1.enity.Product;
import ss17.bai_tap.bai_tap_1.repository.IProductRepository;
import ss17.bai_tap.bai_tap_1.repository.ProductRepository;

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
    public void delete(String maKH) {
        List<Product> productList = productRepository.findAll();
        boolean flag=false;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getMaSP().equals(maKH)){
               productRepository.delete(maKH);
                System.out.println("xoá thành công ");
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("không tìm thấy");
        }
    }


}
