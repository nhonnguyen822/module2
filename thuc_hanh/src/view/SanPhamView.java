package view;

import ennity.SanPham;

import java.util.List;
import java.util.Scanner;

public class SanPhamView {
    private static final Scanner scanner = new Scanner(System.in);
    public static SanPham inputAddProduct() {
        System.out.println("nhập mã sản phẩm ");
        String maSP = scanner.nextLine();
        System.out.println("nhập tên sản phẩm ");
        String tenSP = scanner.nextLine();
        System.out.println("nhập giá");
        int priceSP = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập hãng sản xuât");
        String hangSX = scanner.nextLine();
        System.out.println("mô tả sản phầm");
        String moTaSP = scanner.nextLine();
        return new SanPham(maSP, tenSP, priceSP, hangSX, moTaSP);
    }

    public static void display(List<SanPham> productList) {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }
}
