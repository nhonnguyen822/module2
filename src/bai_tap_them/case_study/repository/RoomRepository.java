package bai_tap_them.case_study.repository;


import bai_tap_them.case_study.enity.Room;

import java.util.ArrayList;

public class RoomRepository implements IRoomRepository {
    private static final ArrayList<Room> rooms = new ArrayList<>();

    static {
        rooms.add(new Room("R-0001", "house1", 50,
                1300000, 5, "Thang", "quet don"));
        rooms.add(new Room("R-0002", "house2", 50,
                1300000, 5, "Thang", "quet don"));
        rooms.add(new Room("R-0003", "house3", 50,
                1300000, 5, "Thang", "quet don"));
    }

    @Override
    public ArrayList<Room> findALL() {
        return rooms;
    }

    @Override
    public void add(Room room) {
        rooms.add(room);
    }
}
