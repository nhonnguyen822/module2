package bai_tap_them.case_study.view;

import bai_tap_them.case_study.enity.Facility;

import java.util.ArrayList;


public class FacilityView {

    //hiển thị danh sach facility

    public static void displayFacility(ArrayList<Facility> facilities) {
        for (int i = 0; i < facilities.size(); i++) {
            System.out.println(facilities.get(i));
        }
    }

}


