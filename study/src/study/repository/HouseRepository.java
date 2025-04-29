package study.repository;

import study.common.RentalType;
import study.common.ReadAndWriteDaTa;
import study.enity.House;
import java.util.*;
import java.util.List;

public class HouseRepository implements IHouseRepository {
    private static final String HOUSE_FILE = "src/study/data/house.csv";
    private static final boolean NOT_APPEND = false;

    private static List<String> convertToListString(Map<House, Integer> houseIntegerMap) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<House, Integer> houseIntegerEntry : houseIntegerMap.entrySet()) {
            House house = houseIntegerEntry.getKey();
            String string = house.convertToString();
            int soLanSuDung = houseIntegerEntry.getValue();
            stringList.add(string + "," + soLanSuDung);
        }
        return stringList;
    }

    private static Map<House, Integer> convertToMapList() {
        Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(HOUSE_FILE);
        for (String string : stringList) {
            String[] line = string.split(",");
            if (line.length == 9) {
                try {
                    String facilityCode = line[0];
                    String facilityName = line[1];
                    double usableArea = Double.parseDouble(line[2]);
                    int rentalCost = Integer.parseInt(line[3]);
                    int maxOfPeople = Integer.parseInt(line[4]);
                    RentalType rentalType = RentalType.valueOf(line[5]);
                    String roomStandard = line[6];
                    int numberOfFloors = Integer.parseInt(line[7]);
                    int numberOfUses = Integer.parseInt(line[8]);
                    House house = new House(facilityCode, facilityName, usableArea,
                            rentalCost, maxOfPeople, rentalType, roomStandard, numberOfFloors);
                    houseIntegerMap.put(house, numberOfUses);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
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
