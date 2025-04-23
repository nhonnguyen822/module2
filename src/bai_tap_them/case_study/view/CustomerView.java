package bai_tap_them.case_study.view;

import bai_tap_them.case_study.enity.Customer;
import bai_tap_them.case_study.enity.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerView {
    public static void displayCustomer(ArrayList<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }

    public static String inputIDCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id want edit");
        return scanner.nextLine();
    }

    //thay đổi thông tin khách hang


    public static void editCustomer(Customer custommer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mã khách hàng  hiện tai " + custommer.getId());
        System.out.println("nhap ma khách hàng muốn thay đổi");
        String id = scanner.nextLine();
        while (true) {
            String regexId = "^KH-\\d{4}";
            Pattern pattern = Pattern.compile(regexId);
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("mã hơp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
                System.out.println("nhập lại mã  khách hàng muốn thay đổi");
                id = scanner.nextLine();
            }
        }
        custommer.setId(id);
        System.out.println("tên khách hàng  hiện tai " + custommer.getName());
        System.out.println("nhap ten khách hàng muôn thay đổi");
        String name = scanner.nextLine();
        while (true) {
            String regexName = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regexName);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ ");
                System.out.println("vui lòng nhập lại  tên khách hàng");
                name = scanner.nextLine();
            }
        }
        custommer.setName(name);
        System.out.println("CMND hiện tai " + custommer.getNumberCMND());
        System.out.println("nhập CMND muốn thay đổi");
        String numberCMND = scanner.nextLine();
        while (true) {
            String regexCMND = "^\\d{9}(\\d{3})?$";
            Pattern pattern = Pattern.compile(regexCMND);
            Matcher matcher = pattern.matcher(numberCMND);
            if (matcher.matches()) {
                System.out.println("CMND hợp lệ");
                break;
            } else {
                System.out.println("CMND không hợp lệ");
                System.out.println("vui lòng nhập lại CMND");
                numberCMND = scanner.nextLine();
            }
        }
        custommer.setNumberCMND(numberCMND);
        System.out.println("SDT  hiện tai " + custommer.getPhoneNumber());
        System.out.println("nhap số điện thoại muốn thay đổi");
        String numberPhone = scanner.nextLine();
        while (true) {
            String regexNumberPhone = "^0\\d{9}$";
            Pattern pattern = Pattern.compile(regexNumberPhone);
            Matcher matcher = pattern.matcher(numberPhone);
            if (matcher.matches()) {
                System.out.println("số điện thoại hợp lệ ");
                break;
            } else {
                System.out.println("số điện thoại không hơp lệ");
                System.out.println("vui lòng nhập lại số điện thoại");
                numberPhone = scanner.nextLine();
            }
        }
        custommer.setPhoneNumber(numberPhone);
        System.out.println("email hiên tại " + custommer.getEmail());
        System.out.println("nhap email muốn thay đổi");
        String email = scanner.nextLine();
        while (true) {
            String regexEmail = "^\\[w._]+@\\[a-z]{3,}\\.\\[a-z]{2,3}$";
            Pattern pattern = Pattern.compile(regexEmail);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("email hợp lệ");
                break;
            } else {
                System.out.println("email không hợp lệ");
                System.out.println("vui lòng nhập email");
                email = scanner.nextLine();
            }
        }
        custommer.setEmail(email);
        System.out.println("loại khách  hiện tai " + custommer.getCustomerType());
        System.out.println("nhập trình độ muốn thay đôỉ");
        String customerType = scanner.nextLine();
        custommer.setCustomerType(customerType);
        System.out.println("địa chỉ  hiện tai " + custommer.getAddress());
        System.out.println("nhập dia chỉ muốn thay đổi");
        String address = scanner.nextLine();
        custommer.setAddress(address);
    }


    //thêm khách hàng

    public static Customer inputCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma khach hang");
        String id = scanner.nextLine();
        while (true) {
            String regexId = "^KH-\\d{4}";
            Pattern pattern = Pattern.compile(regexId);
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("mã hơp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
                System.out.println("nhập lại mã  khách hàng muốn thay đổi");
                id = scanner.nextLine();
            }
        }
        System.out.println("nhap ten khách hàng");
        String name = scanner.nextLine();
        while (true) {
            String regexName = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regexName);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ ");
                System.out.println("vui lòng nhập lại  tên khách hàng");
                name = scanner.nextLine();
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd//MM/yyyy");
        simpleDateFormat.setLenient(false);
        String year;
        while (true) {
            System.out.println("nhap năm sinh");
            year = scanner.nextLine();
            try {
                Date birdDay = simpleDateFormat.parse(year);
                System.out.println("ngay sinh hợp lệ");
                break;
            } catch (ParseException e) {
                System.out.println("ngày sinh không hợp lệ");
            }
        }
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("nhập CMND");
        String numberCMND = scanner.nextLine();
        while (true) {
            String regexCMND = "^\\d{9}(\\d{3})?$";
            Pattern pattern = Pattern.compile(regexCMND);
            Matcher matcher = pattern.matcher(numberCMND);
            if (matcher.matches()) {
                System.out.println("CMND hợp lệ");
                break;
            } else {
                System.out.println("CMND không hợp lệ");
                System.out.println("vui lòng nhập lại CMND");
                numberCMND = scanner.nextLine();
            }
        }
        System.out.println("nhập số điện thoại");
        String numberPhone = scanner.nextLine();
        while (true) {
            String regexNumberPhone = "^0\\d{9}$";
            Pattern pattern = Pattern.compile(regexNumberPhone);
            Matcher matcher = pattern.matcher(numberPhone);
            if (matcher.matches()) {
                System.out.println("số điện thoại hợp lệ ");
                break;
            } else {
                System.out.println("số điện thoại không hơp lệ");
                System.out.println("vui lòng nhập lại số điện thoại");
                numberPhone = scanner.nextLine();
            }
        }
        System.out.println("nhap email");
        String email = scanner.nextLine();
        while (true) {
            String regexEmail = "^\\[w._]+@\\[a-z]{3,}\\.\\[a-z]{2,3}$";
            Pattern pattern = Pattern.compile(regexEmail);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("email hợp lệ");
                break;
            } else {
                System.out.println("email không hợp lệ");
                System.out.println("vui lòng nhập email");
                email = scanner.nextLine();
            }
        }
        System.out.println("nhập loại khách hàng");
        String customerType = scanner.nextLine();
        System.out.println("nhập địa chỉ khách hàng");
        String address = scanner.nextLine();
        return new Customer(id, name, year, gender, numberCMND, numberPhone, email, customerType, address);
    }
}
