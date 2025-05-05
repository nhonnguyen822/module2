package study.repository;

import study.common.RentalType;
import study.common.ReadAndWriteDaTa;
import study.enity.House;
import study.enity.Room;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepository implements IRoomRepository {
    private static final String ROOM_FILE = "src/study/data/room.csv";
    private static final boolean NOT_APPEND = false;

    private static List<String> convertToListString(Map<Room, Integer> roomIntegerMap) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Room, Integer> roomIntegerEntry : roomIntegerMap.entrySet()) {
            Room room = roomIntegerEntry.getKey();
            String string = room.convertToString();
            int numberOfUses = roomIntegerEntry.getValue();
            stringList.add(string + "," + numberOfUses);
        }
        return stringList;
    }

    private static Map<Room, Integer> convertToMapList() {
        Map<Room, Integer> houseIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(ROOM_FILE);
        for (String string : stringList) {
            String[] line = string.split(",");
            if (line.length == 9) {
                try {
                    boolean status= Boolean.parseBoolean(line[0]);
                    String facilityCode = line[1];
                    String facilityName = line[2];
                    double usableArea = Double.parseDouble(line[3]);
                    int rentalCost = Integer.parseInt(line[4]);
                    int maxOfPeople = Integer.parseInt(line[5]);
                    RentalType rentalType = RentalType.valueOf(line[6]);
                    String freeService = line[7];
                    int numberOfUses = Integer.parseInt(line[8]);
                    Room room = new Room(status,facilityCode, facilityName, usableArea, rentalCost, maxOfPeople, rentalType, freeService);
                    houseIntegerMap.put(room, numberOfUses);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
        return houseIntegerMap;
    }

    @Override
    public Map<Room, Integer> findAll() {
        return convertToMapList();
    }

    @Override
    public void add(Room room) {
        Map<Room, Integer> roomIntegerMap = convertToMapList();
        roomIntegerMap.put(room, 0);
        List<String> stringList = convertToListString(roomIntegerMap);
        ReadAndWriteDaTa.writeFileCSV(ROOM_FILE, stringList, NOT_APPEND);
    }

    @Override
    public void edit(Room room, int usage) {
        Map<Room, Integer> roomIntegerMap = convertToMapList();
        for (Map.Entry<Room, Integer> houseIntegerEntry :roomIntegerMap.entrySet()) {
            if (houseIntegerEntry.getKey().equals(room)) {
                houseIntegerEntry.getKey().setStatus(true);
                roomIntegerMap.put(room, usage);
            }
        }
        List<String> stringList = convertToListString(roomIntegerMap);
        ReadAndWriteDaTa.writeFileCSV(ROOM_FILE, stringList, NOT_APPEND);
    }

    @Override
    public Map<Room, Integer> listFacilityNotUsed() {
        Map<Room, Integer> roomIntegerMap = findAll();
        Map<Room, Integer> newRoomIntegerMap = new LinkedHashMap<>();
        for (Map.Entry<Room, Integer> roomIntegerEntry : roomIntegerMap.entrySet()) {
            if (!roomIntegerEntry.getKey().isStatus()) {
                newRoomIntegerMap.put(roomIntegerEntry.getKey(), roomIntegerEntry.getValue());
            }
        }
        return newRoomIntegerMap;
    }
}
