package ss8.service;

import ss8.entity.Car;

import java.util.ArrayList;

public interface ICarService {
    ArrayList<Car> findAll();

    void display(ArrayList<Car> cars);

    void add(Car car);
}
