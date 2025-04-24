package ss8.repository;


import ss12.thuc_hanh.bai_tap_1.common.ReadAndWriteFile;
import ss8.entity.Car;


import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private static final String CAR_FILE = "D:\\codegym\\module2\\src\\ss8\\data\\car.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;


    @Override
    public List<Car> findAll() {
        List<Car> carList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(CAR_FILE);
        for (String string : stringList) {
            String[] line = string.split(",");
            String licensePlate = line[0];
            String manufacturerName = line[1];
            int yearManafacture = Integer.parseInt(line[2]);
            String owner = line[3];
            int numberOfSeat = Integer.parseInt(line[4]);
            String carType = line[5];
            carList.add(new Car(licensePlate, manufacturerName, yearManafacture, owner, numberOfSeat, carType));
        }
        return carList;
    }


    @Override
    public void add(Car car) {
        List<String> stringList = new ArrayList<>();
        stringList.add(car.converToString());
        ReadAndWriteFile.writeFileCSV(CAR_FILE, stringList, APPEND);
    }

    @Override
    public void delete(Car car) {
        List<Car> carList = findAll();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getLicenseplate().equals(car.getLicenseplate())) {
                carList.remove(i);
            }
        }
        List<String> stringList = convertToStringListArray(carList);
        ReadAndWriteFile.writeFileCSV(CAR_FILE, stringList, NOT_APPEND);
    }

    public List<String> convertToStringListArray(List<Car> cars) {
        List<String> stringList = new ArrayList<>();
        for (Car car : cars) {
            stringList.add(car.converToString());
        }
        return stringList;
    }
}