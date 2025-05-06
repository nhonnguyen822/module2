package study.view;

import study.enity.Customer;
import java.util.*;

public class PromotionView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputYear() {
        int year = 0;
        try {
            System.out.println("nhập năm sử dụng dịch vụ");
            year = Integer.parseInt(scanner.nextLine());
            while (year < 0) {
                System.out.println("nhập lại  năm sử dụng dịch vụ");
                year = Integer.parseInt(scanner.nextLine());
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return year;
    }

    public static int quantityVoucher10() {
        int quantity10 = 0;
        while (true) {
            try {
                System.out.println("nhập số lượng voucher 10%");
                quantity10 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return quantity10;
    }

    public static void displayListCustomerVoucher(Queue<Customer> customerList, int v10, int v20, int v50) {
        while (true) {
            if (!customerList.isEmpty()) {
                Customer customer = customerList.poll();
                if (v50 > 0) {
                    System.out.println(customer + "nhận voucher 50%");
                    v50--;
                } else if (v20 > 0) {
                    System.out.println(customer + "nhận voucher 20%");
                    v20--;
                } else if (v10 > 0) {
                    System.out.println(customer + "nhận voucher 10%");
                    v10--;
                } else {
                    System.out.println("hết voucher");
                }
            } else {
                break;
            }
        }
    }

    public static int quantityVoucher50() {
        int quantity50 = 0;
        while (true) {
            try {
                System.out.println("nhập số lượng voucher 50%");
                quantity50 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return quantity50;
    }

    public static int quantityVoucher20() {
        int quantity20 = 0;
        while (true) {
            try {
                System.out.println("nhập số lượng voucher 20%");
                quantity20 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return quantity20;
    }

    public static void display(Set<Customer> customerList) {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}
