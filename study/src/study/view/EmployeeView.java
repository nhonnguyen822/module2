package study.view;

import study.common.Gender;
import study.common.TrinhDo;
import study.common.ViTri;
import study.enity.Employee;
import study.enity.Person;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String nhapMaNV() {
        System.out.println("nhập mã nhân viên ");
        return scanner.nextLine();
    }

    //hiển thị danh sach sinh viên
    public static void display(List<Employee> nhanVienList) {
        for (int i = 0; i < nhanVienList.size(); i++) {
            System.out.println(nhanVienList.get(i));
        }
    }

    //nhập thông tin nhân viên

    public static Employee inputDataNV() {
        System.out.println("nhập mã nhân viên");
        String id = scanner.nextLine();
        while (true) {
            String regex = "^NV-\\d{4}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("mã hợp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
                System.out.println("nhập lại mã nhân viên");
                id = scanner.nextLine();
            }
        }
        System.out.println("nhập tên nhân viên");
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
                System.out.println("nhập lại tên nhân viên");
                name = scanner.nextLine();
            }
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDay = null;
        while (true) {
            System.out.println("nhập ngày sinh với đinh dạng dd/MM/yy");
            String input = scanner.nextLine();
            try {
                birthDay = LocalDate.parse(input, dateTimeFormatter);
                LocalDate toDay = LocalDate.now();
                Period age = Period.between(birthDay, toDay);
                if(age.getYears()>18){
                    break;
                }else {
                    System.out.println("tuổi của nhân viên không được nhỏ hơn 18");
                }
            } catch (DateTimeException e) {
                System.out.println("ngày sinh không hợp lệ");
            }
        }

        Gender gender = null;
        while (gender == null) {
            System.out.println("nhập giới tính");
            String input = scanner.nextLine();
            gender = Gender.fromToString(input);
            if (gender == null) {
                System.out.println("giới tính không hợp lệ vui lòng nhập lại");
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
            String regexEmail = "^[\\w.-]+@([a-zA-Z]{3,6})\\.[a-zA-Z]{2,6}$";
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
        TrinhDo trinhDo = null;
        while (trinhDo == null) {
            System.out.println("nhập trình độ của nhân viên");
            String input = scanner.nextLine();
            trinhDo = TrinhDo.fromToString(input);
            if (trinhDo == null) {
                System.out.println("vui lòng nhập chính xác trình độ ");
            }
        }
        ViTri viTri = null;
        while (viTri == null) {
            System.out.println("nhập vị trí  của nhân viên");
            String input = scanner.nextLine();
            viTri = ViTri.fromToString(input);
            if (viTri == null) {
                System.out.println("vui lòng nhập chính xác vị trí ");
            }
        }
        int salary = 0;
        try {
            System.out.println("nhập lương của nhân viên");
            salary = Integer.parseInt(scanner.nextLine());
            while (salary <= 0) {
                System.out.println("nhập lương của nhân viên phai lon hon 0");
                salary = Integer.parseInt(scanner.nextLine());
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return new Employee(id, name, birthDay, gender, numberCMND, numberPhone, email, trinhDo, viTri, salary);
    }
}
