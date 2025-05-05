package study.controller;

import study.enity.Customer;
import study.service.IPromotionService;
import study.service.PromotionService;
import study.view.PromotionView;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class FuramaPromotionController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IPromotionService promotionService = new PromotionService();
    public static void promotionManagement() {
        String exit = "";
        while (true) {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            System.out.println("nhập lựa chọn của bạn");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    int yearBookingFacility = PromotionView.inputYear();
                    Set<Customer> customerListBookingFacility = promotionService.findAll(yearBookingFacility);
                    PromotionView.display(customerListBookingFacility);
                    break;
                case 2:
                    int quantity10 = PromotionView.quantityVoucher10();
                    int quantity20 = PromotionView.quantityVoucher20();
                    int quantity50 = PromotionView.quantityVoucher50();
                    Stack<Customer> customerList = promotionService.findCustomerVoucher();
                    PromotionView.displayListCustomerVoucher(customerList, quantity10, quantity20, quantity50);
                    break;
                case 3:
                    System.out.println("bạn chọn quay trở lại ,yes or no");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ ");
            }
            if (chose == 3 && exit.toLowerCase().equals("yes")) {
                break;
            }
        }
    }
}
