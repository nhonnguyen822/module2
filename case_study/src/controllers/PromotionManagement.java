package controllers;

import java.util.Scanner;

public class PromotionManagement {
    public PromotionManagement() {
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String exit = "";
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\tReturn main menu");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    System.out.println("your chose Display list customers use service");
                    break;
                case 2:
                    System.out.println("your chose Display list customers get voucher");
                    break;
                case 3:
                    System.out.println("your want to return  (Y OR N)");
                    exit = scanner.nextLine();
                    while (!exit.toLowerCase().equals("n") && !exit.toLowerCase().equals("y")) {
                        System.out.println("your want to return  (Y OR N)");
                        exit = scanner.nextLine();
                    }
            }
            if (chose == 3 && exit.toLowerCase().equals("y")) {
                break;
            }
        }
    }
}
