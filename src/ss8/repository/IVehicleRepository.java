package ss8.repository;

import ss8.entity.Vehicle;
import java.util.List;

public interface IVehicleRepository {
    List<Vehicle> findAdd();

    Vehicle findLicencaPlate(String licencaPlate);

    void delete(Vehicle vehicle);
}
