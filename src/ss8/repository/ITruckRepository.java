package ss8.repository;

import ss8.entity.Truck;
import java.util.List;

public interface ITruckRepository {
    List<Truck> finalAll();

    void add(Truck truck);

    void delete(Truck truck);

}
