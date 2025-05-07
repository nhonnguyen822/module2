package study.repository.impl;

import study.common.RentalType;
import study.common.ReadAndWriteDaTa;
import study.enity.House;
import study.repository.IHouseRepository;
import java.util.*;
import java.util.List;
public class HouseRepository implements IHouseRepository {
    private static final String HOUSE_FILE = "src/study/data/house.csv";
    private static final boolean NOT_APPEND = false;

    public List<String> convertToListString(Map<House, Integer> houseIntegerMap) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<House, Integer> houseIntegerEntry : houseIntegerMap.entrySet()) {
            House house = houseIntegerEntry.getKey();
            String string = house.convertToString();
            int soLanSuDung = houseIntegerEntry.getValue();
            stringList.add(string + "," + soLanSuDung);
        }
        return stringList;
    }

    public Map<House, Integer> convertToMapList() {
        Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(HOUSE_FILE);
        for (String string : stringList) {
            String[] line = string.split(",");
            if (line.length == 10) {
                try {
                    boolean status = Boolean.parseBoolean(line[0]);
                    String facilityCode = line[1];
                    String facilityName = line[2];
                    double usableArea = Double.parseDouble(line[3]);
                    int rentalCost = Integer.parseInt(line[4]);
                    int maxOfPeople = Integer.parseInt(line[5]);
                    RentalType rentalType = RentalType.valueOf(line[6]);
                    String roomStandard = line[7];
                    int numberOfFloors = Integer.parseInt(line[8]);
                    int numberOfUses = Integer.parseInt(line[9]);
                    House house = new House(status, facilityCode, facilityName, usableArea,
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

    @Override
    public void updateUsage(House house, int usage) {
        Map<House, Integer> houseIntegerMap = convertToMapList();
        for (Map.Entry<House, Integer> houseIntegerEntry : houseIntegerMap.entrySet()) {
            if (houseIntegerEntry.getKey().equals(house)) {
                houseIntegerEntry.getKey().setStatus(true);
                houseIntegerMap.put(house, usage);
            }
        }
        List<String> stringList = convertToListString(houseIntegerMap);
        ReadAndWriteDaTa.writeFileCSV(HOUSE_FILE, stringList, NOT_APPEND);
        System.out.println();
    }

    @Override
    public Map<House, Integer> getFacilityNotUsed() {
        Map<House, Integer> houseIntegerMap = findAll();
        Map<House, Integer> newHouseIntegerMap = new LinkedHashMap<>();
        for (Map.Entry<House, Integer> houseIntegerEntry : houseIntegerMap.entrySet()) {
            if (!houseIntegerEntry.getKey().isStatus()) {
                newHouseIntegerMap.put(houseIntegerEntry.getKey(), houseIntegerEntry.getValue());
            }
        }
        return newHouseIntegerMap;
    }
}
