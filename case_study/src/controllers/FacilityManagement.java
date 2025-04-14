package controllers;

import java.util.Scanner;

public class FacilityManagement {
    public FacilityManagement() {
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String exit = "";
            System.out.println("1 Display list facility");
            System.out.println("2 Add new facility");
            System.out.println("3 Edit facility");
            System.out.println("4 Return main menu");
            System.out.println("enter your chose");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    System.out.println("your chose 1 Display list facility");
                    break;
                case 2:
                    System.out.println("your chose 2 Add new facility");
                    break;
                case 3:
                    System.out.println("your chose 3 Edit facility");
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
