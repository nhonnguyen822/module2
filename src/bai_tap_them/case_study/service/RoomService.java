package bai_tap_them.case_study.service;

import bai_tap_them.case_study.enity.Room;

import java.util.ArrayList;

public class RoomService implements IRoomService {
    private static final IRoomService roomService = new RoomService();

    @Override
    public ArrayList<Room> findALL() {
        return roomService.findALL();
    }

    @Override
    public void add(Room room) {
        roomService.add(room);
    }
}
