package study.service;

import study.enity.House;
import study.repository.HouseRepository;
import study.repository.IHouseRepository;

import java.util.Map;

public class HouseService implements IHouseService {
    private static final IHouseRepository houseRepository = new HouseRepository();

    @Override
    public Map<House, Integer> findAll() {
        return houseRepository.findAll();
    }

    @Override
    public void add(House house) {
        houseRepository.add(house);
    }
}
