package ss8.service;

import ss8.entity.Vehicle;
import java.util.List;

public interface IVehicleService {
    List<Vehicle> findAdd();
    Vehicle findLicencaPlate(String licencaPlate);
    void delete(Vehicle vehicle);
}


