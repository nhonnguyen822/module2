package study.service.impl;

import study.enity.House;
import study.repository.impl.HouseRepository;
import study.repository.IHouseRepository;
import study.service.IHouseService;

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

    @Override
    public void updateUsage(House house, int usage) {
        houseRepository.updateUsage(house, usage);
    }

    @Override
    public Map<House, Integer> getFacilityNotUsed() {
        return houseRepository.getFacilityNotUsed();
    }
}
