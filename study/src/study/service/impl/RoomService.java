package study.service.impl;

import study.enity.Room;
import study.repository.IRoomRepository;
import study.repository.impl.RoomRepository;
import study.service.IRoomService;

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
    public void updateUsage(Room room, int usage) {
        roomRepository.updateUsage(room, usage);
    }

    @Override
    public Map<Room, Integer> getFacilityNotUsed() {
        return roomRepository.getFacilityNotUsed();
    }
}
