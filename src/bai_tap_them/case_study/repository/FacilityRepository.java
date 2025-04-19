package bai_tap_them.case_study.repository;

import bai_tap_them.case_study.enity.Facility;
import bai_tap_them.case_study.enity.House;
import bai_tap_them.case_study.enity.Room;
import bai_tap_them.case_study.enity.Villa;

import java.util.ArrayList;

public class FacilityRepository implements IFacilityRepository {
    private static final ArrayList<Facility> facilityList = new ArrayList<>();
    private static final IRoomRepository roomRepository = new RoomRepository();
    private static final IVillaRepository villaRepository = new VillaRepository();
    private static final IHouseRepository houseRepository = new HouseRepository();


    @Override
    public ArrayList<Facility> findALL() {
        ArrayList<Room> rooms = roomRepository.findALL();
        ArrayList<Villa> villas = villaRepository.findALL();
        ArrayList<House> houses = houseRepository.findALL();
        facilityList.addAll(rooms);
        facilityList.addAll(villas);
        facilityList.addAll(houses);
        return facilityList;
    }

    @Override
    public void add(Facility entity) {

    }
}
