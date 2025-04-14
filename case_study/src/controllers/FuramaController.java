package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        CustomerManagement customerManagement = new CustomerManagement();
        FacilityManagement facilityManagement = new FacilityManagement();
        BookingManagerment bookingManagerment = new BookingManagerment();
        PromotionManagement promotionManagement = new PromotionManagement();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            try {
                System.out.println("enter your chose ");
                int chose = Integer.parseInt(scanner.nextLine());
                switch (chose) {
                    case 1:
                        employeeManagement.display();
                        break;
                    case 2:
                        customerManagement.display();
                        break;
                    case 3:
                        facilityManagement.display();
                        break;
                    case 4:
                        bookingManagerment.display();
                        break;
                    case 5:
                        promotionManagement.display();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("re-enter your chose");

                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());

            }
        }
    }
}
