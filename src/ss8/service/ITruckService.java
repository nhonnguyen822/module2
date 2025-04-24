package ss8.service;

import ss8.entity.Truck;
import java.util.List;

public interface ITruckService {
    List<Truck> findAll();
    void add(Truck truck);
}
