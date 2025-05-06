package study.controller;

import study.enity.Facility;
import study.enity.House;
import study.enity.Room;
import study.enity.Villa;
import study.service.impl.FacilityService;
import study.service.IFacilityService;
import study.view.FacilityView;
import study.view.HouseView;
import study.view.RoomView;
import study.view.VillaView;

import java.util.Map;
import java.util.Scanner;

public class FuramaFacilityController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IFacilityService<Facility> facilityService = new FacilityService();
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
                        facilityService.add(villa);
                        break;
                    case 2:
                        House house = HouseView.add();
                        facilityService.add(house);
                        break;
                    case 3:
                        Room room = RoomView.add();
                        facilityService.add(room);
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

}
