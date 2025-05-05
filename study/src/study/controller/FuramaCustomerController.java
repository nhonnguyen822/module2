package study.controller;

import study.enity.Customer;
import study.service.CustomerService;
import study.service.ICustomerService;
import study.view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class FuramaCustomerController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICustomerService customerService = new CustomerService();
    public static void customerManagement() {
        String exit = "";
        while (true) {
            System.out.println("1\tDisplay list customer\n" +
                    "2\tAdd new customer\n" +
                    "3\tEdit customer\n" +
                    "4\tReturn main menu\n");
            try {
                System.out.println("nhập lựa chọn của bạn");
                int chose = Integer.parseInt(scanner.nextLine());
                switch (chose) {
                    case 1:
                        List<Customer> khachHangList = customerService.findAll();
                        CustomerView.display(khachHangList);
                        break;
                    case 2:
                        Customer khachHangAdd = CustomerView.inputDataCustomer();
                        customerService.add(khachHangAdd);
                        break;
                    case 3:
                        String maKH = CustomerView.inputIdCustomer();
                        Customer khachHangEdit = CustomerView.inputDataCustomer();
                        customerService.edit(khachHangEdit, maKH);
                        break;
                    case 4:
                        System.out.println("bạn chọn quay trở lại ,yes or no");
                        exit = scanner.nextLine().toLowerCase();
                        break;
                    default:
                        System.out.println("lựa chọn không hợp lệ ");
                }
                if (chose == 4 && exit.equalsIgnoreCase("yes")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
