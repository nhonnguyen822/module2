package study.view;

import study.enity.Customer;

import java.util.List;
import java.util.Scanner;

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
    public static void displayListCustomerVoucher(List<Customer>customerList,int v10,int v20,int v50){
        for (int i = 0; i <customerList.size(); i++) {
            if(v10>0){
                System.out.println(customerList.get(i)+"nhận được voucher 10%");
            }else if(v20>0){
                System.out.println(customerList.get(i)+"nhận được voucher 20%");
            }else if(v50>0){
                System.out.println(customerList.get(i)+"nhận được voucher 50%");
            }else {
                System.out.println("đã hết voucher");
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

    public static void display(List<Customer> customerList) {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}
