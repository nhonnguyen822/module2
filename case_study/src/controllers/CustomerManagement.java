package controllers;

import java.util.Scanner;

public class CustomerManagement {
    public CustomerManagement() {
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String exit = "";
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4 Return main menu");
            System.out.println("enter your chose");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    System.out.println("your chose Display list customers");
                    break;
                case 2:
                    System.out.println("your chose Add new customer");
                    break;
                case 3:
                    System.out.println("your chose Edit customer");
                    break;
                case 4:
                    System.out.println("your want to return  (Y OR N)");
                    exit = scanner.nextLine();
                    while (!exit.toLowerCase().equals("n") && !exit.toLowerCase().equals("y")) {
                        System.out.println("your want to return  (Y OR N)");
                        exit = scanner.nextLine();
                    }
            }
            if (chose == 4 && exit.toLowerCase().equals("y")) {
                break;
            }
        }
    }
}

