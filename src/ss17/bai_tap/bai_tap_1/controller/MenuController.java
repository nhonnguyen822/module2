package ss17.bai_tap.bai_tap_1.controller;

import ss17.bai_tap.bai_tap_1.enity.Product;
import ss17.bai_tap.bai_tap_1.service.IProductService;
import ss17.bai_tap.bai_tap_1.service.ProductService;
import ss17.bai_tap.bai_tap_1.view.ProductView;

import java.util.List;
import java.util.Scanner;

public class MenuController {
    public static void main(String[] args) {
        menu();
    }

    private static final IProductService productService = new ProductService();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (true) {
            System.out.println(">>>>Menu>>>>>\n" +
                    "1.Thêm sản phẩm \n" +
                    "2.Tìm kiếm sản phẩm \n" +
                    "3.Hiển thị danh sách sản phẩm \n" +
                    "4.Xoá sản phẩm \n" +
                    "5.Thoát \n");
            System.out.println("nhập lựa chọn của bạn");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    Product product = ProductView.inputAddProduct();
                    productService.add(product);
                    break;
                case 2:
                    String maSPToSearch = ProductView.inputMaSP();
                    List<Product> productListSearch = productService.findAll();
                    boolean flag = false;
                    for (int i = 0; i < productListSearch.size(); i++) {
                        if (productListSearch.get(i).getMaSP().equals(maSPToSearch)) {
                            System.out.println("sản phẩm đươc tìm thấy");
                            ProductView.search(productListSearch, maSPToSearch);
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("không tìm thấy sản phẩm");
                    }
                    ProductView.search(productListSearch, maSPToSearch);
                    break;
                case 3:
                    List<Product> productList = productService.findAll();
                    ProductView.display(productList);
                    break;
                case 4:
                    String maSPToDelete = ProductView.inputMaSP();
                    productService.delete(maSPToDelete);
                    break;
                case 5:
                    System.out.println("bạn muốn thoát ,nhập y");
                    exit = scanner.nextLine();
                    break;
            }
            if (chose == 4 && exit.toLowerCase().equals("y")) {
                break;
            }
        }
    }
}
