package ss1_tong_quan_java.thuc_hanh.thuc_hanh_3;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai hcn");
        int chieuDai = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap chieu rong hcn");
        int chieuRong = Integer.parseInt(scanner.nextLine());
        int chuVi = (chieuDai + chieuRong) * 2;
        System.out.println("chu vi hcn la:" + chuVi);
        int dienTich = chieuDai * chieuRong;
        System.out.println("dien tich hcn la:" + dienTich);
    }
}
