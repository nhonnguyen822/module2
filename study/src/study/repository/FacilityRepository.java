package study.repository;

import study.common.KieuThue;
import study.common.ReadAndWriteDaTa;
import study.enity.Facility;
import java.util.*;

public class FacilityRepository implements IFacilityRepository<Facility> {
    private static final String DICH_VU_FILE = "src/study/data/facility.csv";
    private static final boolean NOT_APPEND = false;

    public static List<String> convertToListString(Map<Facility, Integer> dichVuMap) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Facility, Integer> dichVuIntegerEntry : dichVuMap.entrySet()) {
            Facility dichVu = dichVuIntegerEntry.getKey();
            Integer soLanSuDung = dichVuIntegerEntry.getValue();
            String line = dichVu + "," + soLanSuDung;
            stringList.add(line);
        }
        return stringList;
    }

    public static Map<Facility, Integer> convertToMapFacility() {
        Map<Facility, Integer> dichVuIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(DICH_VU_FILE);
        for (String s : stringList) {
            String[] line = s.split(",");
            String maDV = line[0];
            String tenDV = line[1];
            double dienTichSuDung = Double.parseDouble(line[2]);
            int chiPhiThue = Integer.parseInt(line[3]);
            int soLuongNguoiToiDa = Integer.parseInt(line[4]);
            KieuThue kieuThue = KieuThue.valueOf(line[5]);
            int soLanSuDung = Integer.parseInt(line[6]);
            Facility dichVu = new Facility(maDV, tenDV, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
            dichVuIntegerMap.put(dichVu, soLanSuDung);
        }
        return dichVuIntegerMap;
    }

    @Override
    public Map<Facility, Integer> findAll() {
        return convertToMapFacility();
    }

    @Override
    public void add(Facility dichVu) {
        Map<Facility, Integer> dichVuIntegerMap = convertToMapFacility();
        dichVuIntegerMap.put(dichVu, 0);
        ReadAndWriteDaTa.writeFileCSV(DICH_VU_FILE, convertToListString(dichVuIntegerMap), NOT_APPEND);
    }
}
