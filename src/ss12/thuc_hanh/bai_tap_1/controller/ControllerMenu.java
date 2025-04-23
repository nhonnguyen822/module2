package ss12.thuc_hanh.bai_tap_1.controller;

import ss12.thuc_hanh.bai_tap_1.enity.Product;
import ss12.thuc_hanh.bai_tap_1.service.IProductService;
import ss12.thuc_hanh.bai_tap_1.service.ProductService;
import ss12.thuc_hanh.bai_tap_1.view.ProductView;

import java.util.List;
import java.util.Scanner;

public class ControllerMenu {
    public static void main(String[] args) {
        displayMenu();
    }

    private static final IProductService productService = new ProductService();



    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (true) {
            System.out.println("......Menu.....\n" +
                    "1.Thêm sản phẩm \n" +
                    "2.Xoá sản phẩm theo id\n" +
                    "3.Hiển thị danh sách sản phẩm\n" +
                    "4.Tìm kiếm sản phẩm theo tên\n" +
                    "5.Sắp xếp tăng dần \n" +
                    "6.Sắp xếp giảm dần \n" +
                    "7.Thay đổi thông tin \n" +
                    "8.Exit");
            System.out.println("enter your chose");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    Product product = ProductView.add();
                    productService.add(product);
                    break;
                case 2:
                    int idDelete = ProductView.inputID();
                    productService.delete(idDelete);
                    break;
                case 3:
                    List<Product> products = productService.findAll();
                    ProductView.display(products);
                    break;
                case 4:
                    String nameSeach = ProductView.inputName();
                    List<Product> productsSearch = productService.findAll();
                    boolean test = false;
                    for (int i = 0; i < productsSearch.size(); i++) {
                        if (productsSearch.get(i).getName().contains(nameSeach)) {
                            System.out.println(productsSearch.get(i));
                            test = true;
                        }
                    }
                    if (!test) {
                        System.out.println("is not find ");
                    }
                    break;
                case 5:
                    List<Product> products1 = productService.findAll();
                    productService.ascendingOder(products1);
                    break;
                case 6:
                    List<Product> products2 = productService.findAll();
                    productService.decreasingOder(products2);
                    break;
                case 7:
                    int idEdit = ProductView.inputID();
                    List<Product> productsEdit = productService.findAll();
                    boolean testID = false;
                    for (int i = 0; i < productsEdit.size(); i++) {
                        if (productsEdit.get(i).getId() == idEdit) {
                            ProductView.edit(productsEdit.get(i));
                            productService.edit(productsEdit.get(i));
                            testID = true;
                        }
                    }
                    if (!testID) {
                        System.out.println("is not find id");
                    }
                    break;
                case 8:
                    System.out.println(" your chose exit Y or N");
                    exit = scanner.nextLine();
                    break;
            }
            if (chose == 8 && exit.toLowerCase().equals("y")) {
                break;
            }
        }

    }
}
