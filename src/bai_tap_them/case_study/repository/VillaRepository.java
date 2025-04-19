package bai_tap_them.case_study.repository;

import bai_tap_them.case_study.enity.Facility;
import bai_tap_them.case_study.enity.Villa;

import java.util.ArrayList;

public class VillaRepository implements IVillaRepository {
    private static final ArrayList<Villa> villas = new ArrayList<>();

    static {
        villas.add(new Villa("VL-0001", "villaA", 100, 20000000,
                20, "Tháng", "Nguyen Van A", 50, 5));
        villas.add(new Villa("VL-0002", "villaB", 100, 20000000,
                20, "Tháng", "Nguyen Van B", 50, 5));
        villas.add(new Villa("VL-0010", "villaC", 100, 20000000,
                20, "Tháng", "Nguyen Van C", 50, 5));
    }


    @Override
    public ArrayList<Villa> findALL() {
        return villas;
    }

    @Override
    public void add(Villa villa) {
        villas.add(villa);
    }
}
