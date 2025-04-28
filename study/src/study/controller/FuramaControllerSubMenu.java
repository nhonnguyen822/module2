package study.controller;

import study.enity.*;
import study.repository.HouseRepository;
import study.repository.IRoomRepository;
import study.service.*;
import study.view.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FuramaControllerSubMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IKhachHangService khachHangService = new KhachHangService();
    private static final INhanVienService nhanVienService = new NhanVienService();
    private static final IFacilityService facilityService = new FacilityService();
    private static final IRoomService roomService = new RoomService();
    private static final IHouseService houseService = new HouseService();
    private static final IVillaService villaService = new VillaService();

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
                        List<NhanVien> nhanVienList = nhanVienService.findAll();
                        NhanVienView.display(nhanVienList);
                        break;
                    case 2:
                        NhanVien nhanVien = NhanVienView.inputDataKH();
                        nhanVienService.add(nhanVien);
                        break;
                    case 3:
                        String maNV = KhachHangView.nhapMaKH();
                        NhanVien nhanVienEdit = NhanVienView.inputDataKH();
                        nhanVienService.edit(nhanVienEdit, maNV);
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
                        List<KhachHang> khachHangList = khachHangService.findAll();
                        KhachHangView.display(khachHangList);
                        break;
                    case 2:
                        KhachHang khachHangAdd = KhachHangView.inputDataKH();
                        khachHangService.add(khachHangAdd);
                        break;
                    case 3:
                        String maKH = KhachHangView.nhapMaKH();
                        KhachHang khachHangEdit = KhachHangView.inputDataKH();
                        khachHangService.edit(khachHangEdit, maKH);
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
                        House house = HouseView.add();
                        houseService.add(house);
                        break;
                    case 2:
                        Room room = RoomView.add();
                        roomService.add(room);
                        break;
                    case 3:
                        Villa villa = VillaView.add();
                        villaService.add(villa);
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
                    break;
                case 2:
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
