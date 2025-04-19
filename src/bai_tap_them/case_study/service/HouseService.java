package bai_tap_them.case_study.service;

import bai_tap_them.case_study.enity.House;
import bai_tap_them.case_study.repository.HouseRepository;
import bai_tap_them.case_study.repository.IHouseRepository;

import java.util.ArrayList;

public class HouseService implements IHouseService {
    private static final IHouseRepository houseRepository = new HouseRepository();

    @Override
    public ArrayList<House> findALL() {
        return houseRepository.findALL();
    }

    @Override
    public void add(House house) {
        houseRepository.add(house);
    }
}
