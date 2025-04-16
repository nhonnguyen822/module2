package ss8.service;

import ss8.entity.Vehicle;
import java.util.ArrayList;

public interface IVehicleService {
    ArrayList<Vehicle> findAdd();
    Vehicle findLicencaPlate(String licencaPlate);
    void delete(Vehicle vehicle);
}


