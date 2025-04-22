package ss12.thuc_hanh.bai_tap_1.common;

import ss12.thuc_hanh.bai_tap_1.enity.Product;

import java.util.Comparator;

public class AscendingOrder implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
