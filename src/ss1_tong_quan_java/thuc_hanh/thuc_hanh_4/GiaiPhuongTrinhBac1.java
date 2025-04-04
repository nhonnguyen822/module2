package ss1_tong_quan_java.thuc_hanh.thuc_hanh_4;

import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("input b");
        int b = Integer.parseInt(scanner.nextLine());
        float x;
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            x = (float) -b / a;
            System.out.println("nghiem cua phuong trinh la :" + x);
        }
    }
}
