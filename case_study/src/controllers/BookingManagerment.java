package controllers;

import java.util.Scanner;

public class BookingManagerment {
    public BookingManagerment() {
    }

    public void display() {

        while (true) {
            String exit = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.\tAdd new booking");
            System.out.println("2.\tDisplay list booking");
            System.out.println("3.\tCreate new contracts");
            System.out.println("4.\tDisplay list contracts");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");
            System.out.println("enter your chose");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    System.out.println("your chose Add new booking");
                    break;
                case 2:
                    System.out.println("your chose Display list booking");
                    break;
                case 3:
                    System.out.println("your chose Create new contracts");
                    break;
                case 4:
                    System.out.println("your chose Display list contracts");
                    break;
                case 5:
                    System.out.println("your chose Edit contracts");
                    break;
                case 6:
                    System.out.println("your chose Return main menu");
                    exit = scanner.nextLine();
                    while (!exit.toLowerCase().equals("n") && !exit.toLowerCase().equals("y")) {
                        System.out.println("your want to return  (Y OR N)");
                        exit = scanner.nextLine();
                    }
                    break;
            }
            if (chose == 6 && exit.toLowerCase().equals("y")) {
                break;
            }
        }

    }
}
