package ss8.repository;

import ss8.entity.Car;

import java.util.ArrayList;

public interface ICarRepository {
    ArrayList<Car> findAll();

    void display(ArrayList<Car> cars);

    void add(Car car);

    void delete(Car car);
}
