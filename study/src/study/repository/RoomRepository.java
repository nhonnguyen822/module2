package study.repository;

import study.common.RentalType;
import study.common.ReadAndWriteDaTa;
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
            if (line.length == 8) {
                try {
                    String facilityCode = line[0];
                    String facilityName = line[1];
                    double usableArea = Double.parseDouble(line[2]);
                    int rentalCost = Integer.parseInt(line[3]);
                    int maxOfPeople = Integer.parseInt(line[4]);
                    RentalType rentalType = RentalType.valueOf(line[5]);
                    String freeService = line[6];
                    int numberOfUses = Integer.parseInt(line[7]);
                    Room room = new Room(facilityCode, facilityName, usableArea, rentalCost, maxOfPeople, rentalType, freeService);
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
}
