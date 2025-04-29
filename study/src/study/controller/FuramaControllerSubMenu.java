package study.controller;

import study.enity.*;
import study.service.*;
import study.view.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FuramaControllerSubMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICustomerService customerService = new CustomerService();
    private static final IEmployeeService employeeService = new EmployeeService();
    private static final IFacilityService facilityService = new FacilityService();
    private static final IRoomService roomService = new RoomService();
    private static final IHouseService houseService = new HouseService();
    private static final IVillaService villaService = new VillaService();
    private static final IBookingServie bookingService = new BookingService();


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
                        Employee nhanVien = EmployeeView.inputDataKH();
                        employeeService.add(nhanVien);
                        break;
                    case 3:
                        String maNV = CustomerView.inputIdCustomer();
                        Employee nhanVienEdit = EmployeeView.inputDataKH();
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

    public static void customerManagement() {
        String exit = "";
        while (true) {
            System.out.println("1\tDisplay list customer\n" +
                    "2\tAdd new customer\n" +
                    "3\tEdit customer\n" +
                    "4\tReturn main menu\n");
            try {
                System.out.println("nhập lựa chọn của bạn");
                int chose = Integer.parseInt(scanner.nextLine());
                switch (chose) {
                    case 1:
                        List<Customer> khachHangList = customerService.findAll();
                        CustomerView.display(khachHangList);
                        break;
                    case 2:
                        Customer khachHangAdd = CustomerView.inputDataCustomer();
                        customerService.add(khachHangAdd);
                        break;
                    case 3:
                        String maKH = CustomerView.inputIdCustomer();
                        Customer khachHangEdit = CustomerView.inputDataCustomer();
                        customerService.edit(khachHangEdit, maKH);
                        break;
                    case 4:
                        System.out.println("bạn chọn quay trở lại ,yes or no");
                        exit = scanner.nextLine().toLowerCase();
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


    public static void facilityManagement() {
        String exit = "";
        while (true) {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            try {
                System.out.println("nhập lựa chọn của bạn");
                int chose = Integer.parseInt(scanner.nextLine());
                switch (chose) {
                    case 1:
                        Map<Facility, Integer> facilityIntegerMap = facilityService.findAll();
                        FacilityView.display(facilityIntegerMap);
                        break;
                    case 2:
                        listAddFacility();
                        break;
                    case 3:
                        Map<Facility, Integer> facilityIntegerMapMaintenance = facilityService.findAll();
                        FacilityView.displayFacilityMaintenance(facilityIntegerMapMaintenance);
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

    public static void listAddFacility() {
        String exit = "";
        while (true) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            try {
                System.out.println("nhập lựa chọn của bạn");
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
                        System.out.println("bạn chọn quay trở lại ,yes or no");
                        exit = scanner.nextLine().trim();
                        break;
                    default:
                        System.out.println("lựa chọn không hợp lệ ");
                        break;
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

    //hien thi bookingManagement

    public static void bookingManagement() {
        String exit = "";
        while (true) {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            System.out.println("nhập lựa chọn của bạn");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    List<Customer> customerList = customerService.findAll();
                    Customer customer = BookingView.selectCustomerBooking(customerList);
                    Map<Facility, Integer> facilityIntegerMap = facilityService.findAll();
                    Facility facility = BookingView.selectFacilityBooking(facilityIntegerMap);
                    Booking booking = BookingView.inputDataBooking(customer, facility);
                    bookingService.add(booking);
                    break;
                case 2:
                    Set<Booking> bookingSet = bookingService.findAll();
                    BookingView.display(bookingSet);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("bạn chọn quay trở lại ,yes or no");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ ");
            }
            if (chose == 6 && exit.toLowerCase().equals("yes")) {
                break;
            }
        }
    }

    /// promotionManagement hien thi

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
                    break;
                case 2:
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
