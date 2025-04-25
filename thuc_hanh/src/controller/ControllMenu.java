package controller;

import ennity.SanPham;
import service.ISanPhamService;
import service.SanPhamService;
import view.SanPhamView;

import java.util.List;
import java.util.Scanner;

public class ControllMenu {
    public static void main(String[] args) {
        menu();
    }

    private static ISanPhamService sanPhamService = new SanPhamService();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (true) {
            System.out.println(">>>>Menu>>>>>\n" +
                    "1.Thêm sản phẩm \n" +
                    "2.Tìm kiếm sản phẩm \n" +
                    "3.Hiển thị danh sách sản phẩm \n" +
                    "4.Thoát");
            System.out.println("nhập lựa chọn của bạn");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    SanPham product = SanPhamView.inputAddProduct();
                    sanPhamService.add(product);
                    break;
                case 2:
                    break;
                case 3:
                    List<SanPham> productList = sanPhamService.findAll();
                    SanPhamView.display(productList);
                    break;
                case 4:
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
