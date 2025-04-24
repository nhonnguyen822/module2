package ss8.repository;


import ss12.thuc_hanh.bai_tap_1.common.ReadAndWriteFile;
import ss8.entity.Motor;
import java.util.ArrayList;
import java.util.List;

public class MotorRepository implements IMotorRepository {
    private static ArrayList<Motor> motors = new ArrayList<>();

    private static final String MOTO_FILE = "D:\\codegym\\module2\\src\\ss8\\data\\moto.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    @Override
    public List<Motor> finalAll() {
        List<Motor> motorList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(MOTO_FILE);
        for (String string : stringList) {
            String[] line = string.split(",");
            String licensePlate = line[0];
            String manufacturerName = line[1];
            int yearManafacture = Integer.parseInt(line[2]);
            String owner = line[3];
            double capacity = Double.parseDouble(line[4]);
            motorList.add(new Motor(licensePlate, manufacturerName, yearManafacture, owner, capacity));
        }
        return motorList;
    }

    @Override
    public void add(Motor motor) {
        List<String> stringList = new ArrayList<>();
        stringList.add(motor.converToString());
        ReadAndWriteFile.writeFileCSV(MOTO_FILE, stringList, APPEND);
    }

    @Override
    public void delete(Motor motor) {
        List<Motor> motorList = finalAll();
        for (int i = 0; i < motorList.size(); i++) {
            if (motorList.get(i).getLicenseplate().equals(motor.getLicenseplate())) {
                motorList.remove(i);
            }
        }
        List<String> stringList = convertToStringListArray(motorList);
        ReadAndWriteFile.writeFileCSV(MOTO_FILE, stringList, NOT_APPEND);
    }

    public List<String> convertToStringListArray(List<Motor> motors) {
        List<String> stringList = new ArrayList<>();
        for (Motor motor : motors) {
            stringList.add(motor.converToString());
        }
        return stringList;
    }
}
