package study.repository;
import study.enity.Facility;

import java.util.*;

public class FacilityRepository implements IFacilityRepository<Facility> {
    private static final IRoomRepository roomRepository = new RoomRepository();
    private static final IVillaRepository villaRepository = new VillaRepository();
    private static final IHouseRepository houseRepository = new HouseRepository();

    @Override
    public Map<Facility, Integer> findAll() {
        Map<Facility, Integer> dichVuIntegerMap = new HashMap<>();
        dichVuIntegerMap.putAll(roomRepository.findAll());
        dichVuIntegerMap.putAll(villaRepository.findAll());
        dichVuIntegerMap.putAll(houseRepository.findAll());
        return dichVuIntegerMap;
    }

    @Override
    public void add(Facility facility) {
    }
}
