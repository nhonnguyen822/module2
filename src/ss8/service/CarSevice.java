package ss8.service;

import ss8.entity.Car;
import ss8.repository.CarRepository;
import ss8.repository.ICarRepository;

import java.util.ArrayList;

public class CarSevice implements ICarService {
    private ICarRepository carRepository = new CarRepository();

    @Override
    public ArrayList<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void display(ArrayList<Car> cars) {
        carRepository.display(cars);
    }

    @Override
    public void add(Car car) {
        carRepository.add(car);
    }
}
