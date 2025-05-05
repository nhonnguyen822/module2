package study.controller;


import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        String exit = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("displayMainMenu() \n");
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            try {
                System.out.println("nhập lựa chọn của bạn");
                int chose = Integer.parseInt(scanner.nextLine());
                switch (chose) {
                    case 1:
                        FuramaControllerSubMenu.employeeManagement();
                        break;
                    case 2:
                        FuramaControllerSubMenu.customerManagement();
                        break;
                    case 3:
                        FuramaControllerSubMenu.facilityManagement();
                        break;
                    case 4:
                        FuramaControllerSubMenu.bookingManagement();
                        break;
                    case 5:
                        FuramaControllerSubMenu.promotionManagement();
                        break;
                    case 6:
                        System.out.println("bạn chọn quay trở lại ,yes or no");
                        exit = scanner.nextLine().toLowerCase();
                        break;
                    default:
                        System.out.println("lựa chọn không họp lệ ");

                }
                if (chose == 6 && exit.equalsIgnoreCase("yes")) {
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
