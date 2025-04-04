package ss1_tong_quan_java.bai_tap.bai_tap_2;

import java.util.Scanner;

public class TinhTyGiaTienUSD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("select amount to exchange");
            System.out.println("1.to VND");
            System.out.println("2.to USD");
            option = Integer.parseInt(scanner.nextLine());
        } while (option != 2 && option != 1);

        if (option == 1) {
            System.out.println("input $USD");
            double moneyUSD = Double.parseDouble(scanner.nextLine());
            System.out.println("conver to VND: " + String.format("%.2f", moneyUSD * 26000) + "VND");
        } else {
            System.out.println("input VND");
            double moneyVND = Double.parseDouble(scanner.nextLine());
            System.out.println("convert to USD: " + String.format("%.2f", moneyVND / 26000) + "USD");
        }
    }
}

