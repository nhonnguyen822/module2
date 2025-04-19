package bai_tap_them.case_study.view;

import bai_tap_them.case_study.enity.Employee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeView {

    //hiên thi danh sach nhân viên
    public static void displayEmployee(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }


    //nhập id nhân viên muốn thay đổi thông tin

    public static String inputIDEmployeeEdit() {
        return CustomerView.inputIDCustomer();
    }

    //Thay đổi thông tin nhân viên

    public static void editEmployee(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mã nhân viên  hiện tai " + employee.getId());
        System.out.println("nhap ma nhan vien muốn thay đổi");
        String id = scanner.nextLine();
        while (true) {
            String regexId = "^NV-\\d{4}$";
            Pattern pattern = Pattern.compile(regexId);
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("mã hợp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
                System.out.println("nhap ma nhan vien muốn thay đổi");
                id = scanner.nextLine();
            }
        }
        employee.setId(id);
        System.out.println("tên nhân viên  hiện tai " + employee.getName());
        System.out.println("nhap ten nhan vien muôn thay đổi");
        String name = scanner.nextLine();
        while (true) {
            String regexName = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regexName);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("vui lòng nhập lại  tên nhân  vien");
                name = scanner.nextLine();
            }
        }
        employee.setName(name);
        System.out.println("CMND hiện tai " + employee.getNumberCMND());
        System.out.println("nhập CMND muốn thay đổi");
        String numberCMND = scanner.nextLine();
        while (true) {
            String regexCMND = "^\\d{9}(\\d{3})?$";
            Pattern pattern = Pattern.compile(regexCMND);
            Matcher matcher = pattern.matcher(numberCMND);
            if (matcher.matches()) {
                System.out.println("số CMND hợp lệ");
                break;
            } else {
                System.out.println("sô cmnd không hợp lệ");
                System.out.println("vui lòng nhập lại CMND");
                numberCMND = scanner.nextLine();
            }
        }
        employee.setNumberCMND(numberCMND);
        System.out.println("SDT  hiện tai " + employee.getPhoneNumber());
        System.out.println("nhap số điện thoại muốn thay đổi");
        String numberPhone = scanner.nextLine();
        employee.setPhoneNumber(numberPhone);
        while (true) {
            String regexPhone = "^[0]\\d{9}$";
            Pattern pattern = Pattern.compile(regexPhone);
            Matcher matcher = pattern.matcher(numberPhone);
            if (matcher.matches()) {
                System.out.println("số điện thoại hợp lệ");
                break;
            } else {
                System.out.println("sô điện thoại không hợp lệ");
                System.out.println("nhập lại  số điện thoại");
                numberPhone = scanner.nextLine();
            }
        }
        System.out.println("email hiên tại " + employee.getEmail());
        System.out.println("nhap email muốn thay đổi");
        String email = scanner.nextLine();
        while (true) {
            String regexEmail = "^[\\w._]+@[\\w.]+\\.[a-zZ-a]{2,3}$";
            Pattern pattern = Pattern.compile(regexEmail);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("email hợp lệ");
                break;
            } else {
                System.out.println("email không hợp lệ");
                System.out.println("vui lòng nhập lại email");
                email = scanner.nextLine();
            }
        }
        employee.setEmail(email);
        System.out.println("trình độ  hiện tai " + employee.getLevel());
        System.out.println("nhập trình độ muốn thay đôỉ");
        String level = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(level);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("vui lòng nhập lại  trình độ");
                level = scanner.nextLine();
            }
        }
        employee.setLevel(level);
        System.out.println("vai trò  hiện tai " + employee.getRole());
        System.out.println("nhập vai trò muốn thay đổi");
        String role = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(role);
            if (matcher.matches()) {
                System.out.println("tên vai trò hợp lệ");
                break;
            } else {
                System.out.println("vui lòng nhập vai trò");
                role = scanner.nextLine();
            }
        }
        employee.setRole(role);
        System.out.println("lương  hiện tai " + employee.getSalary());
        System.out.println("nhập lương muốn thay đổi");
        double salary = Double.parseDouble(scanner.nextLine());
        while (salary <= 0) {
            System.out.println("vui lòng nhập lại lương ");
            salary = Double.parseDouble(scanner.nextLine());
        }
        employee.setSalary(salary);
    }


    //thêm một nhân viên
    public static Employee inputEmployee() {
        Scanner scanner = new Scanner(System.in);
        String id;
        do {
            String regexId = "^NV-\\d{4}$";
            Pattern pattern = Pattern.compile(regexId);
            System.out.println("nhap ma nhan vien");
            id = scanner.nextLine();
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("id hợp lệ");
                break;
            } else {
                System.out.println("id không hợp lệ");
            }
        } while (true);

        System.out.println("nhap ten nhan vien");
        String name = scanner.nextLine();
        while (true) {
            String regexName = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regexName);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("vui lòng nhập lại  tên nhân  vien");
                name = scanner.nextLine();
            }
        }
        System.out.println("nhap năm sinh");
        String year = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("nhập CMND");
        String numberCMND = scanner.nextLine();
        while (true) {
            String regexCMND = "^\\d{9}(\\d{3})?$";
            Pattern pattern = Pattern.compile(regexCMND);
            Matcher matcher = pattern.matcher(numberCMND);
            if (matcher.matches()) {
                System.out.println("số CMND hợp lệ");
                break;
            } else {
                System.out.println("sô cmnd không hợp lệ");
                System.out.println("vui lòng nhập lại CMND");
                numberCMND = scanner.nextLine();
            }
        }
        System.out.println("nhap số điện thoại");
        String numberPhone = scanner.nextLine();
        while (true) {
            String regexPhone = "^[0]\\d{9}$";
            Pattern pattern = Pattern.compile(regexPhone);
            Matcher matcher = pattern.matcher(numberPhone);
            if (matcher.matches()) {
                System.out.println("số điện thoại hợp lệ");
                break;
            } else {
                System.out.println("sô điện thoại không hợp lệ");
                System.out.println("nhập lại  số điện thoại");
                numberPhone = scanner.nextLine();
            }
        }
        System.out.println("nhap email");
        String email = scanner.nextLine();
        while (true) {
            String regexEmail = "^[\\w._]+@[\\w.]+\\.[a-zZ-a]{2,3}$";
            Pattern pattern = Pattern.compile(regexEmail);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("email hợp lệ");
                break;
            } else {
                System.out.println("email không hợp lệ");
                System.out.println("vui lòng nhập lại email");
                email = scanner.nextLine();
            }
        }
        System.out.println("nhập trình độ");
        String level = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(level);
            if (matcher.matches()) {
                System.out.println("tên hợp lệ");
                break;
            } else {
                System.out.println("vui lòng nhập lại  trình độ");
                level = scanner.nextLine();
            }
        }
        System.out.println("nhập vai trò");
        String role = scanner.nextLine();
        while (true) {
            String regex = "^([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(role);
            if (matcher.matches()) {
                System.out.println("tên vai trò hợp lệ");
                break;
            } else {
                System.out.println("vui lòng nhập vai trò");
                role = scanner.nextLine();
            }
        }
        System.out.println("nhập lương");
        double salary = Double.parseDouble(scanner.nextLine());
        while (salary <= 0) {
            System.out.println("vui lòng nhập lại lương ");
            salary = Double.parseDouble(scanner.nextLine());
        }
        return new Employee(id, name, year, gender, numberCMND, numberPhone, email, level, role, salary);
    }
}
