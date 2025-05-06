package study.service.impl;

import study.enity.Facility;
import study.enity.House;
import study.enity.Room;
import study.enity.Villa;
import study.service.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService<Facility> {
    private static final IHouseService houseService = new HouseService();
    private static final IVillaService villaService = new VillaService();
    private static final IRoomService roomService = new RoomService();


    @Override
    public Map<Facility, Integer> findAll() {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        facilityIntegerMap.putAll(houseService.findAll());
        facilityIntegerMap.putAll(villaService.findAll());
        facilityIntegerMap.putAll(roomService.findAll());
        return facilityIntegerMap;
    }

    @Override
    public void add(Facility facility) {
        if (facility instanceof Villa) {
            villaService.add((Villa) facility);
        } else if (facility instanceof House) {
            houseService.add((House) facility);
        } else if (facility instanceof Room) {
            roomService.add((Room) facility);
        }
    }

    public Map<Facility, Integer> getFacilityNotUsed() {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        facilityIntegerMap.putAll(houseService.getFacilityNotUsed());
        facilityIntegerMap.putAll(villaService.getFacilityNotUsed());
        facilityIntegerMap.putAll(roomService.getFacilityNotUsed());
        return facilityIntegerMap;
    }

    @Override
    public void updateUsage(Facility facility, int usage) {
        if (facility instanceof Villa) {
            villaService.updateUsage((Villa) facility, usage);
        } else if (facility instanceof House) {
            houseService.updateUsage((House) facility, usage);
        } else if (facility instanceof Room) {
            roomService.updateUsage((Room) facility, usage);
        }
    }
}
