package bai_tap_them.case_study.repository;

import bai_tap_them.case_study.enity.House;

import java.util.ArrayList;

public class HouseRepository implements IHouseRepository {
    private static final ArrayList<House> houses = new ArrayList<>();

    static {
        houses.add(new House("HO-0001", "thuê nhà", 50, 5000000, 8,
                "tháng", "Nguyen Van A", 2));
        houses.add(new House("HO-0002", "thuê nhà", 50, 5000000, 8,
                "tháng", "Nguyen Van B", 2));
        houses.add(new House("HO-0003", "thuê nhà", 50, 5000000, 8,
                "tháng", "Nguyen Van C", 2));
    }

    @Override
    public ArrayList<House> findALL() {
        return houses;
    }

    @Override
    public void add(House house) {
        houses.add(house);
    }
}
