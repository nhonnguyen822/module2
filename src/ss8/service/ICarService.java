package ss8.service;

import ss8.entity.Car;
import java.util.List;

public interface ICarService {
    List<Car> findAll();


    void add(Car car);
}
