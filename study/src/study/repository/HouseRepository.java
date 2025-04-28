package study.repository;

import study.common.KieuThue;
import study.common.ReadAndWriteDaTa;
import study.enity.House;

import java.awt.*;
import java.util.*;
import java.util.List;

public class HouseRepository implements IHouseRepository {
    private static final String HOUSE_FILE = "src/study/data/house.csv";
    private static final boolean NOT_APPEND = false;

    private static List<String> convertToListString(Map<House, Integer> houseIntegerMap) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<House, Integer> houseIntegerEntry : houseIntegerMap.entrySet()) {
            House house = houseIntegerEntry.getKey();
            int soLanSuDung = houseIntegerEntry.getValue();
            stringList.add(house + "," + soLanSuDung);
        }
        return stringList;
    }

    private static Map<House, Integer> convertToMapList() {
        Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(HOUSE_FILE);
        for (String string : stringList) {
            String[] line = string.split(",");
            String maDV = line[0];
            String tenDV = line[1];
            double dienTichSuDung = Double.parseDouble(line[2]);
            int chiPhiThue = Integer.parseInt(line[3]);
            int soLuongNguoiToiDa = Integer.parseInt(line[4]);
            KieuThue kieuThue = KieuThue.valueOf(line[5]);
            String tieuChuanPhong = line[6];
            int soTang = Integer.parseInt(line[7]);
            int soLanSuDung = Integer.parseInt(line[8]);
            House house = new House(maDV, tenDV, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
            houseIntegerMap.put(house, soLanSuDung);
        }
        return houseIntegerMap;
    }

    @Override
    public Map<House, Integer> findAll() {
        return convertToMapList();
    }

    @Override
    public void add(House house) {
        Map<House, Integer> houseIntegerMap = convertToMapList();
        houseIntegerMap.put(house, 0);
        List<String> stringList = convertToListString(houseIntegerMap);
        ReadAndWriteDaTa.writeFileCSV(HOUSE_FILE, stringList, NOT_APPEND);
    }
}
