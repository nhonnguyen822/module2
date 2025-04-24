package ss12.thuc_hanh.bai_tap_1.repository;

import ss12.thuc_hanh.bai_tap_1.common.ReadAndWriteFile;
import ss12.thuc_hanh.bai_tap_1.enity.Product;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String PRODUCT_FILE = "D:\\codegym\\module2\\src\\ss12\\thuc_hanh\\bai_tap_1\\data\\product.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    public List<String> convertToStringListArray(List<Product> productList) {
        List<String> stringList = new ArrayList<>();
        for (Product product : productList) {
            stringList.add(product.convertToString());
        }
        return stringList;
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PRODUCT_FILE);
        for (String string : stringList) {
            String[] line = string.split(",");
            int id = Integer.parseInt(line[0]);
            String name = line[1];
            int price = Integer.parseInt(line[2]);
            productList.add(new Product(id, name, price));
        }
        return productList;
    }

    @Override
    public void add(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.convertToString());
        ReadAndWriteFile.writeFileCSV(PRODUCT_FILE, stringList, APPEND);
    }

    @Override
    public void edit(int id, Product product) {
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.get(i).setId(product.getId());
                productList.get(i).setName(product.getName());
                productList.get(i).setPrice(product.getPrice());
            }
        }
        List<String> stringList = convertToStringListArray(productList);
        ReadAndWriteFile.writeFileCSV(PRODUCT_FILE, stringList, NOT_APPEND);
    }

    @Override
    public void delete(int id) {
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
                break;
            }
        }
        List<String> stringList = convertToStringListArray(productList);
        ReadAndWriteFile.writeFileCSV(PRODUCT_FILE, stringList, NOT_APPEND);
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
}
