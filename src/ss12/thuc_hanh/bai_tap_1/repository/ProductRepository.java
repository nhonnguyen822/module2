package ss12.thuc_hanh.bai_tap_1.repository;

import ss12.thuc_hanh.bai_tap_1.enity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        ghiFile(products);
        return docFile();
    }

    @Override
    public void add(Product product) {
        ghiFile(products);
        products.add(product);
    }

    @Override
    public Product edit(Product product) {
        ghiFile(products);
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
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    @Override
    public void decreasingOder(List<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }

    public void ghiFile(List<Product> products) {
        try {
            FileWriter fileWriter = new FileWriter("src/ss12/thuc_hanh/bai_tap_1/product.txt");
            if(products.isEmpty()){
                products.add(new Product(1, "But Chi", 10000));
                products.add(new Product(2, "Sach", 12000));
                products.add(new Product(3, "But Xoa", 5000));
            }
            for (Product product : products) {
                fileWriter.write("id:" + product.getId() + " ,name:" + product.getName() +
                        " ,price:" + product.getPrice() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    public List<Product> docFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader
                    (new FileReader("src/ss12/thuc_hanh/bai_tap_1/product.txt"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] property = line.split(",");
                int id = Integer.parseInt(property[0]);
                String name = property[1];
                int price = Integer.parseInt(property[2]);
                products.add(new Product(id, name, price));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return products;
    }
}
