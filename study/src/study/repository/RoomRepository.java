package study.repository;

import study.common.KieuThue;
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
            int soLanSuDung = roomIntegerEntry.getValue();
            stringList.add(room + "," + soLanSuDung);
        }
        return stringList;
    }

    private static Map<Room, Integer> convertToMapList() {
        Map<Room, Integer> houseIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(ROOM_FILE);
        for (String string : stringList) {
            String[] line = string.split(",");
            String maDV = line[0];
            String tenDV = line[1];
            double dienTichSuDung = Double.parseDouble(line[2]);
            int chiPhiThue = Integer.parseInt(line[3]);
            int soLuongNguoiToiDa = Integer.parseInt(line[4]);
            KieuThue kieuThue = KieuThue.valueOf(line[5]);
            String dichVuMienPhi = line[6];
            int soLanSuDung = Integer.parseInt(line[7]);
            Room room = new Room(maDV, tenDV, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuMienPhi);
            houseIntegerMap.put(room, soLanSuDung);
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
