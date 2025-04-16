package ss8.repository;

import ss8.entity.Truck;

import java.util.ArrayList;

public interface ITruckRepository {
    ArrayList<Truck> finalAll();

    void add(Truck truck);

    void delete(Truck truck);

    void display(ArrayList<Truck> trucks);
}
