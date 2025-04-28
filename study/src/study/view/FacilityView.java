package study.view;

import study.enity.Facility;

import java.util.Map;

public class FacilityView {
    public static void display(Map<Facility, Integer> facilityIntegerMap) {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            System.out.println(facilityIntegerEntry.getKey());
            System.out.println(facilityIntegerEntry.getValue());
        }
    }
}
