package study.view;

import study.common.Gender;
import study.common.CustomerType;
import study.enity.Customer;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerView {
    private static final Scanner scanner = new Scanner(System.in);

    // lấy id khách hàng

    public static String inputIdCustomer() {
        System.out.println("nhập mã khách hang ");
        return scanner.nextLine();
    }

    //hiển thị danh sách khách hàng
    public static void display(List<Customer> khachHangList) {
        for (int i = 0; i < khachHangList.size(); i++) {
            System.out.println(khachHangList.get(i));
        }
    }

    // them mới khách hàng

    public static Customer inputDataAddCustomer() {
        System.out.println("nhập mã khách hàng ");
        String id = scanner.nextLine();
        while (true) {
            String regex = "^KH-\\d{4}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("mã hợp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
                System.out.println("nhập lại mã khách ");
                id = scanner.nextLine();
            }
        }
        System.out.println("nhập tên khách hàng ");
        String name = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ");
                System.out.println("nhập lại tên khách hàng ");
                name = scanner.nextLine();
            }
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDay = null;
        while (true) {
            System.out.println("nhập ngày sinh với đinh dạng dd/MM/yyyy");
            String input = scanner.nextLine();
            try {
                birthDay = LocalDate.parse(input, dateTimeFormatter);
                LocalDate toDay = LocalDate.now();
                Period age = Period.between(birthDay, toDay);
                if (age.getYears() > 18) {
                    break;
                } else {
                    System.out.println("tuổi khách hàng không được nhỏ hơn 18");
                }
            } catch (Exception e) {
                System.out.println("ngày sinh không hợp lệ");
            }
        }

        Gender gender = null;
        while (gender == null) {
            System.out.println("nhập giới tính ");
            String input = scanner.nextLine();
            gender = Gender.fromToString(input);
            if (gender == null) {
                System.out.println("nhập lại giới tính ");
            }
        }
        System.out.println("nhập số CMND /CCCD");
        String numberCMND = scanner.nextLine();
        while (true) {
            String regexCMND = "^\\d{9}(\\d{3})?$";
            Pattern pattern = Pattern.compile(regexCMND);
            Matcher matcher = pattern.matcher(numberCMND);
            if (matcher.matches()) {
                System.out.println("số CMND/CCCD hợp lệ");
                break;
            } else {
                System.out.println("CMND không hợp lệ");
                System.out.println("nhập lại số CMND /CCCD");
                numberCMND = scanner.nextLine();
            }
        }
        System.out.println("nhập số điện thoại ");
        String numberPhone = scanner.nextLine();
        while (true) {
            String regexSoDT = "^(\\d{2}-)?(0\\d{9})$";
            Pattern pattern = Pattern.compile(regexSoDT);
            Matcher matcher = pattern.matcher(numberPhone);
            if (matcher.matches()) {
                System.out.println("số điện thoại hợp lệ");
                break;
            } else {
                System.out.println("số điện thoại không hợp lệ");
                System.out.println("nhập số điện thoại ");
                numberPhone = scanner.nextLine();
            }
        }
        System.out.println("nhập email ");
        String email = scanner.nextLine();
        while (true) {
            String regexEmail = "^[\\w.-]+@([a-zA-Z]{3,6})(\\.[a-zA-Z]{2,6}){1,2}$";
            Pattern pattern = Pattern.compile(regexEmail);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("email hợp lệ");
                break;
            } else {
                System.out.println("email không hợp lệ");
                System.out.println("nhập email");
                email = scanner.nextLine();
            }
        }
        CustomerType customerType = null;
        while (customerType == null) {
            System.out.println("nhập loại khách hàng (Diamond, Platinum, Gold, Silver, Member)");
            String input = scanner.nextLine();
            customerType = CustomerType.fromToString(input);
            if (customerType == null) {
                System.out.println("vui lòng nhập lại loại khách hàng (Diamond, Platinum, Gold, Silver, Member)");
            }
        }
        System.out.println("nhập địa chỉ khách hàng ");
        String address = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(address);
            if (matcher.matches()) {
                System.out.println("địa chỉ  hợp lệ");
                break;
            } else {
                System.out.println("địa chỉ không hợp lệ");
                System.out.println("nhập lại địa chỉ");
                address = scanner.nextLine();
            }
        }
        return new Customer(id, name, birthDay, gender, numberCMND, numberPhone, email, customerType, address);
    }

    //thay đổi thong tin khách hàng

    public static Customer inputDataEditCustomer(Customer customer) {
        String customerId = customer.getId();
        System.out.println("tên khách hàng hiện tại " + customer.getName());
        System.out.println("nhập tên khách hàng ");
        String name = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("tên không hợp lệ");
                System.out.println("nhập lại tên khách hàng ");
                name = scanner.nextLine();
            }
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDay = null;
        while (true) {
            System.out.println("ngày sinh hiện tại của khách hàng " + customer.getBirtDay());
            System.out.println("nhập ngày sinh với đinh dạng dd/MM/yyyy");
            String input = scanner.nextLine();
            try {
                birthDay = LocalDate.parse(input, dateTimeFormatter);
                LocalDate toDay = LocalDate.now();
                Period age = Period.between(birthDay, toDay);
                if (age.getYears() > 18&&age.getYears()<100) {
                    break;
                } else {
                    System.out.println("tuổi khách hàng không được nhỏ hơn 18 và lớn hơn 100");
                }
            } catch (Exception e) {
                System.out.println("ngày sinh không hợp lệ");
            }
        }

        Gender gender = null;
        while (gender == null) {
            System.out.println("giới tính hiện tại của khách hàng " + customer.getGender());
            System.out.println("nhập giới tính ");
            String input = scanner.nextLine();
            gender = Gender.fromToString(input);
            if (gender == null) {
                System.out.println("nhập lại giới tính ");
            }
        }
        System.out.println("nhập số CMND /CCCD hiện tại "+customer.getNumberCMND());
        System.out.println("nhập số CMND /CCCD");
        String numberCMND = scanner.nextLine();
        while (true) {
            String regexCMND = "^\\d{9}(\\d{3})?$";
            Pattern pattern = Pattern.compile(regexCMND);
            Matcher matcher = pattern.matcher(numberCMND);
            if (matcher.matches()) {
                System.out.println("số CMND/CCCD hợp lệ");
                break;
            } else {
                System.out.println("CMND không hợp lệ");
                System.out.println("nhập lại số CMND /CCCD");
                numberCMND = scanner.nextLine();
            }
        }
        System.out.println("số điện thoại hiện tại "+customer.getNumberPhone());
        System.out.println("nhập số điện thoại ");
        String numberPhone = scanner.nextLine();
        while (true) {
            String regexSoDT = "^(\\d{2}-)?(0\\d{9})$";
            Pattern pattern = Pattern.compile(regexSoDT);
            Matcher matcher = pattern.matcher(numberPhone);
            if (matcher.matches()) {
                System.out.println("số điện thoại hợp lệ");
                break;
            } else {
                System.out.println("số điện thoại không hợp lệ");
                System.out.println("nhập số điện thoại ");
                numberPhone = scanner.nextLine();
            }
        }
        System.out.println("email hiện tại "+customer.getEmail());
        System.out.println("nhập email ");
        String email = scanner.nextLine();
        while (true) {
            String regexEmail = "^[\\w.-]+@([a-zA-Z]{3,6})(\\.[a-zA-Z]{2,6}){1,2}$";
            Pattern pattern = Pattern.compile(regexEmail);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("email hợp lệ");
                break;
            } else {
                System.out.println("email không hợp lệ");
                System.out.println("nhập email");
                email = scanner.nextLine();
            }
        }
        CustomerType customerType = null;
        while (customerType == null) {
            System.out.println("loại khách hàng hiện tại "+customer.getCustomerType());
            System.out.println("nhập loại khách hàng (Diamond, Platinum, Gold, Silver, Member)");
            String input = scanner.nextLine();
            customerType = CustomerType.fromToString(input);
            if (customerType == null) {
                System.out.println("vui lòng nhập lại loại khách hàng (Diamond, Platinum, Gold, Silver, Member)");
            }
        }
        System.out.println("địa chỉ hiện tại "+customer.getAddress());
        System.out.println("nhập địa chỉ khách hàng ");
        String address = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(address);
            if (matcher.matches()) {
                System.out.println("địa chỉ  hợp lệ");
                break;
            } else {
                System.out.println("địa chỉ không hợp lệ");
                System.out.println("nhập lại địa chỉ");
                address = scanner.nextLine();
            }
        }
        return new Customer(customerId, name, birthDay, gender, numberCMND, numberPhone, email, customerType, address);
    }
}
