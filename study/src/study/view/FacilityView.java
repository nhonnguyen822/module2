package study.view;

import study.enity.Facility;
import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static final Scanner scanner = new Scanner(System.in);

    //hiển thị danh sách dich vụ

    public static void display(Map<Facility, Integer> facilityIntegerMap) {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            if (facilityIntegerEntry.getValue() >= 0 && facilityIntegerEntry.getValue() < 5) {
                System.out.println(facilityIntegerEntry.getKey());
                System.out.println(facilityIntegerEntry.getValue());
            }
        }
    }

    //hiển thị danh sách các dịch vụ đang bảo trì
    public static void displayFacilityMaintenance(Map<Facility, Integer> facilityIntegerMap) {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            if (facilityIntegerEntry.getValue() == 5) {
                System.out.println(facilityIntegerEntry.getKey());
                System.out.println(facilityIntegerEntry.getValue());
            }
        }
    }

    //lấy mã dịch vụ
    public static String inputIdFacility() {
        System.out.println("nhập mã dịch vụ ");
        return scanner.nextLine();
    }
}
