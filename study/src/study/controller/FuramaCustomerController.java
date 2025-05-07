package study.controller;

import study.enity.Customer;
import study.service.impl.CustomerService;
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
                        List<Customer> customerList = customerService.findAll();
                        CustomerView.display(customerList);
                        break;
                    case 2:
                        Customer customerAdd = CustomerView.inputDataAddCustomer();
                        customerService.add(customerAdd);
                        break;
                    case 3:
                        String customerCode = CustomerView.inputIdCustomer();
                        boolean check = customerService.check(customerCode);
                        if (check) {
                            List<Customer> customers = customerService.findAll();
                            for (Customer customer : customers) {
                                if (customer.getId().equals(customerCode)) {
                                    Customer customerEdit = CustomerView.inputDataEditCustomer(customer);
                                    customerService.edit(customerEdit);
                                    System.out.println("đổi thành công");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("không tìm thấy mã khách hàng ");
                        }
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
