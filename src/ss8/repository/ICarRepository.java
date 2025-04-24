package ss8.repository;

import ss8.entity.Car;
import java.util.List;

public interface ICarRepository {
    List<Car> findAll();


    void add(Car car);

    void delete(Car car);
}
