package bai_tap_them.case_study.controller;

import bai_tap_them.case_study.enity.*;
import bai_tap_them.case_study.service.*;
import bai_tap_them.case_study.view.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllMenuMain {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        do {
            System.out.println(".......Menu......");
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management\n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("enter your chose");
            try {
                int chose = Integer.parseInt(scanner.nextLine());
                switch (chose) {
                    case 1:
                        displayMenuEmployee();
                        break;
                    case 2:
                        displayMenuCustomer();
                        break;
                    case 3:
                        displayMenuFacility();
                        break;
                    case 4:
                        displayMenuBooking();
                        break;
                    case 5:
                        displayMenuPromotion();
                        break;
                    case 6:
                        do {
                            System.out.println("your chose exit Y or N");
                            exit = scanner.nextLine();
                        }
                        while (!exit.toLowerCase().equals("y") && !exit.toLowerCase().equals("n"));
                        break;
                    default:
                        System.out.println("re-your chose exit Y or N");

                }
                if (chose == 6 && exit.toLowerCase().equals("y")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }


        } while (true);
    }

    //    hiên thi quan ly nhân  viên
    private static final IEmployeeService employeeService = new EmployeeService();

    public static void displayMenuEmployee() {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (true) {
            System.out.println("......Employee Management.....");
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            System.out.println("enter your chose");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    ArrayList<Employee> employees = employeeService.findALL();
                    EmployeeView.displayEmployee(employees);
                    break;
                case 2:
                    Employee employee = EmployeeView.inputEmployee();
                    employeeService.add(employee);
                    break;
                case 3:
                    String idEdit = EmployeeView.inputIDEmployeeEdit();
                    List<Employee> employeeList = employeeService.findALL();
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (employeeList.get(i).getId().equals(idEdit)) {
                            EmployeeView.editEmployee(employeeList.get(i));
                            employeeService.edit(employeeList.get(i));
                        }
                    }
                    break;
                case 4:
                    do {
                        System.out.println("your chose exit Y or N");
                        exit = scanner.nextLine();
                    }
                    while (!exit.toLowerCase().equals("y") && !exit.toLowerCase().equals("n"));
                    break;
            }
            if (chose == 4 && exit.toLowerCase().equals("y")) {
                break;
            }
        }
    }


//   hien thi  quan ly dich vụ

    public static void displayMenuFacility() {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (true) {
            System.out.println("......Facility Management.....");
            System.out.println("1\tDisplay list Facility\n" +
                    "2\tAdd new Facility\n" +
                    "3\tEdit Facility\n" +
                    "4\tReturn main menu\n");
            System.out.println("enter your chose");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    ArrayList<Facility> facilities = facilityService.findALL();
                    FacilityView.displayFacility(facilities);
                    break;
                case 2:
                    displayMenuAddFacility();
                    break;
                case 3:
                    break;
                case 4:
                    do {
                        System.out.println("your chose exit Y or N");
                        exit = scanner.nextLine();
                    }
                    while (!exit.toLowerCase().equals("y") && !exit.toLowerCase().equals("n"));
                    break;
            }
            if (chose == 4 && exit.toLowerCase().equals("y")) {
                break;
            }
        }
    }

    //hien thi menu  dich vu thêm

    private static final IFacilityService facilityService = new FacilityService();
    private static final IHouseService houseService = new HouseService();
    private static final IVillaService villaService = new VillaService();
    private static final IRoomService roomService = new RoomService();

    public static void displayMenuAddFacility() {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (true) {
            System.out.println("......Add new Facility.......");
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            System.out.println("enter your chose");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    Villa villa = VillaView.add();
                    villaService.add(villa);
                    break;
                case 2:
                    House house = HouseView.add();
                    houseService.add(house);
                    break;
                case 3:
                    Room room = RoomView.add();
                    roomService.add(room);
                    break;
                case 4:
                    do {
                        System.out.println("your chose Back to menu Y or N");
                        exit = scanner.nextLine();
                    }
                    while (!exit.toLowerCase().equals("y") && !exit.toLowerCase().equals("n"));
                    break;
            }
            if (chose == 4 && exit.toLowerCase().equals("y")) {
                break;
            }
        }
    }

    //hiem thi menu quan ly khách hang

    private static final ICustomerService customerSevice = new CustomerService();

    public static void displayMenuCustomer() {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (true) {
            System.out.println("......Customer Management.....");
            System.out.println("1\tDisplay list Customer\n" +
                    "2\tAdd new Customer\n" +
                    "3\tEdit Customer\n" +
                    "4\tReturn main menu\n");
            System.out.println("enter your chose");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    ArrayList<Customer> customers = customerSevice.findALL();
                    CustomerView.displayCustomer(customers);
                    break;
                case 2:
                    Customer customer = CustomerView.inputCustomer();
                    customerSevice.add(customer);
                    break;
                case 3:
                    String customerIdEdit = CustomerView.inputIDCustomer();
                    List<Customer> customerList = customerSevice.findALL();
                    for (int i = 0; i < customerList.size(); i++) {
                        if (customerList.get(i).getId().equals(customerIdEdit)) {
                            CustomerView.editCustomer(customerList.get(i));
                            customerSevice.edit(customerList.get(i));
                            System.out.println("thay đổi thành công");
                            break;
                        } else {
                            System.out.println("không tim thấy id của bạn");
                        }
                    }

                    break;
                case 4:
                    do {
                        System.out.println("your chose exit Y or N");
                        exit = scanner.nextLine();
                    }
                    while (!exit.toLowerCase().equals("y") && !exit.toLowerCase().equals("n"));
                    break;
            }
            if (chose == 4 && exit.toLowerCase().equals("y")) {
                break;
            }
        }
    }


    public static void displayMenuBooking() {
        System.out.println("......Booking Management.....");
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
    }

    public static void displayMenuPromotion() {
        System.out.println("......Promotion Management.....");
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
    }

}
