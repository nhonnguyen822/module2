package study.view;

import study.enity.Facility;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void display(Map<Facility, Integer> facilityIntegerMap) {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            if (facilityIntegerEntry.getValue() >= 0 && facilityIntegerEntry.getValue() < 5) {
                System.out.println(facilityIntegerEntry.getKey());
                System.out.println(facilityIntegerEntry.getValue());
            }
        }
    }

    public static void displayFacilityMaintenance(Map<Facility, Integer> facilityIntegerMap) {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            if (facilityIntegerEntry.getValue() == 5) {
                System.out.println(facilityIntegerEntry.getKey());
                System.out.println(facilityIntegerEntry.getValue());
            }
        }
    }

    public static String inputIdFacility() {
        System.out.println("nhập mã dịch vụ ");
        return scanner.nextLine();
    }
}
