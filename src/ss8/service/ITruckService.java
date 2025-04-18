package ss8.service;

import ss8.entity.Motor;
import ss8.entity.Truck;
import java.util.ArrayList;

public interface ITruckService {
    ArrayList<Truck> findAll();
    void add(Truck truck);
    void display(ArrayList<Truck> trucks);
}
