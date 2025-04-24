package ss8.repository;


import ss12.thuc_hanh.bai_tap_1.common.ReadAndWriteFile;
import ss8.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static final String TRUCK_FILE = "D:\\codegym\\module2\\src\\ss8\\data\\truck.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;


    @Override
    public List<Truck> finalAll() {
        List<Truck> truckList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(TRUCK_FILE);
        for (String string : stringList) {
            String[] line = string.split(",");
            String licensePlate = line[0];
            String manufacturerName = line[1];
            int yearManafacture = Integer.parseInt(line[2]);
            String owner = line[3];
            double payload = Double.parseDouble(line[4]);
            truckList.add(new Truck(licensePlate, manufacturerName, yearManafacture, owner, payload));
        }
        return truckList;
    }

    @Override
    public void add(Truck truck) {
        List<String> stringList = new ArrayList<>();
        stringList.add(truck.converToString());
        ReadAndWriteFile.writeFileCSV(TRUCK_FILE, stringList, APPEND);
    }

    @Override
    public void delete(Truck truck) {
        List<Truck> truckList = finalAll();
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getLicenseplate().equals(truck.getLicenseplate())) {
                truckList.remove(i);
            }
        }
        List<String> stringList = convertToStringListArray(truckList);
        ReadAndWriteFile.writeFileCSV(TRUCK_FILE, stringList, NOT_APPEND);
    }

    public List<String> convertToStringListArray(List<Truck> trucks) {
        List<String> stringList = new ArrayList<>();
        for (Truck truck : trucks) {
            stringList.add(truck.converToString());
        }
        return stringList;
    }
}
