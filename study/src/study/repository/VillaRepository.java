package study.repository;

import study.common.RentalType;
import study.common.ReadAndWriteDaTa;
import study.enity.House;
import study.enity.Villa;

import java.util.*;

public class VillaRepository implements IVillaRepository {
    private static final String VILLA_FILE = "src/study/data/villa.csv";
    private static final boolean NOT_APPEND = false;


    public final List<String> convertToListString(Map<Villa, Integer> villaIntegerMap) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Villa, Integer> villaIntegerEntry : villaIntegerMap.entrySet()) {
            Villa villa = villaIntegerEntry.getKey();
            String stringVilla = villa.convertToString();
            int soLanSuDung = villaIntegerEntry.getValue();
            stringList.add(stringVilla + "," + soLanSuDung);
        }
        return stringList;
    }

    public final Map<Villa, Integer> convertToMapList() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(VILLA_FILE);
        if (!stringList.isEmpty()) {
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
                        double poolArea = Double.parseDouble(line[7]);
                        int numberOfUses = Integer.parseInt(line[8]);
                        Villa villa = new Villa(facilityCode, facilityName, usableArea,
                                rentalCost, maxOfPeople, rentalType, roomStandard, poolArea);
                        villaIntegerMap.put(villa, numberOfUses);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return villaIntegerMap;
    }

    @Override
    public Map<Villa, Integer> findAll() {
        return convertToMapList();
    }

    @Override
    public void add(Villa villa) {
        Map<Villa, Integer> villaIntegerMap = convertToMapList();
        villaIntegerMap.put(villa, 0);
        List<String> stringList = convertToListString(villaIntegerMap);
        ReadAndWriteDaTa.writeFileCSV(VILLA_FILE, stringList, NOT_APPEND);
    }

    @Override
    public void edit(Villa villa, int usage) {
        Map<Villa, Integer> villaIntegerMap = convertToMapList();
        if(villaIntegerMap.containsKey(villa)){
            villaIntegerMap.put(villa,usage);
        }
        List<String> stringList = convertToListString(villaIntegerMap);
        ReadAndWriteDaTa.writeFileCSV(VILLA_FILE, stringList, NOT_APPEND);
    }


}
