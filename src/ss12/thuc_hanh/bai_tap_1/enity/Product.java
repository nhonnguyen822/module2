package ss12.thuc_hanh.bai_tap_1.enity;

import java.io.Serializable;
import java.util.Comparator;

public class Product implements Comparator<Product> {
    private int id;
    private String name;
    private int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }

    public String convertToString() {
        return this.id + "," + this.name + "," + this.price;
    }
}
