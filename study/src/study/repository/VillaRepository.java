package study.repository;

import study.common.KieuThue;
import study.common.ReadAndWriteDaTa;
import study.enity.Villa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VillaRepository implements IVillaRepository {
    private static final String VILLA_FILE = "src/study/enity/Villa.java";
    private static final boolean NOT_APPEND = false;


    private static List<String> convertToListString(Map<Villa, Integer> villaIntegerMap) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Villa, Integer> villaIntegerEntry : villaIntegerMap.entrySet()) {
            Villa villa = villaIntegerEntry.getKey();
            int soLanSuDung = villaIntegerEntry.getValue();
            stringList.add(villa + "," + soLanSuDung);
        }
        return stringList;
    }

    private static Map<Villa, Integer> convertToMapList() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(VILLA_FILE);
        for (String string : stringList) {
            String[] line = string.split(",");
            String maDV = line[0];
            String tenDV = line[1];
            double dienTichSuDung = Double.parseDouble(line[2]);
            int chiPhiThue = Integer.parseInt(line[3]);
            int soLuongNguoiToiDa = Integer.parseInt(line[4]);
            KieuThue kieuThue = KieuThue.valueOf(line[5]);
            String tieuChuanPhong = line[6];
            double dienTichHoBoi = Double.parseDouble(line[7]);
            int soLanSuDung = Integer.parseInt(line[8]);
            Villa villa = new Villa(maDV, tenDV, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi);
            villaIntegerMap.put(villa, soLanSuDung);
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
}
