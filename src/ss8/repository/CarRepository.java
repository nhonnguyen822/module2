package ss8.repository;


import ss8.entity.Car;
import java.util.ArrayList;

public class CarRepository implements ICarRepository {
    private static ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("43A-212.56", "Nguyễn Văn A", 2019, "Du lịch", 5, "Toyota"));
        cars.add(new Car("43B-453.88", "Nguyễn Văn B", 2020, "Xe  khách", 45, "Huyndai"));
        cars.add(new Car("43B-453.89", "Nguyễn Văn C", 2020, "Xe  khách", 16, "Ford"));
    }

    @Override
    public ArrayList<Car> findAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }
}
