package study.service;

import study.enity.Room;
import study.repository.IRoomRepository;
import study.repository.RoomRepository;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RoomService implements IRoomService {
    private static final IRoomRepository roomRepository = new RoomRepository();

    @Override
    public Map<Room, Integer> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public void add(Room room) {
        roomRepository.add(room);
    }

    @Override
    public void edit(Room room, int usage) {
        roomRepository.edit(room, usage);
    }

}
