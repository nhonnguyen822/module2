package ss8.repository;

import ss8.entity.Vehicle;
import java.util.ArrayList;

public interface IVehicleRepository {
    ArrayList<Vehicle> findAdd();

    Vehicle findLicencaPlate(String licencaPlate);

    void delete(Vehicle vehicle);
}
