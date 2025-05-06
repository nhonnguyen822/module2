package study.controller;

import study.enity.Employee;
import study.service.impl.EmployeeService;
import study.service.IEmployeeService;
import study.view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class FuramaEmployyeController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IEmployeeService employeeService = new EmployeeService();
    public static void employeeManagement() {
        String exit = "";
        while (true) {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            try {
                System.out.println("nhập lựa chọn của bạn");
                int chose = Integer.parseInt(scanner.nextLine());
                switch (chose) {
                    case 1:
                        List<Employee> nhanVienList = employeeService.findAll();
                        EmployeeView.display(nhanVienList);
                        break;
                    case 2:
                        Employee nhanVien = EmployeeView.inputDataNV();
                        employeeService.add(nhanVien);
                        break;
                    case 3:
                        String maNV = EmployeeView.nhapMaNV();
                        Employee nhanVienEdit = EmployeeView.inputDataNV();
                        employeeService.edit(nhanVienEdit, maNV);
                        break;
                    case 4:
                        System.out.println("bạn chọn quay trở lại ,yes or no");
                        exit = scanner.nextLine().trim();
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
