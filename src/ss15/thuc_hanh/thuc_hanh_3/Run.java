package ss15.thuc_hanh.thuc_hanh_3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("enter student name ");
        String name = scanner.nextLine();
        LocalDate birthDate = null;
        while (true) {
            System.out.println("enter student birtDate (dd/MM/yyyy)");
            String input = scanner.nextLine();
            try {
                birthDate = LocalDate.parse(input, dateTimeFormatter);
                break;
            } catch (DateTimeException e) {
                System.out.println("Ngày không hợp lệ. Vui lòng nhập lại.");
            }
        }

        Gender gender = null;
        System.out.println("nhập giới tính");
        while (true){
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("nam")) {
                gender = Gender.MALE;
                break;
            } else if (input.equals("nu") || input.equals("nữ")) {
                gender = Gender.FEMALE;
                break;
            }else {
                System.out.println("nhập lại giới tính");
            }
        }
        Student student = new Student(name, birthDate, gender);
        System.out.println(student);
    }
}
