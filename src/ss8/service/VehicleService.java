package ss8.service;

import ss8.entity.Vehicle;
import ss8.repository.IVehicleRepository;
import ss8.repository.VehicleRepository;

import java.util.ArrayList;

public class VehicleService implements IVehicleService {
    private IVehicleRepository vehicleRepository = new VehicleRepository();

    @Override
    public ArrayList<Vehicle> findAdd() {
        return vehicleRepository.findAdd();
    }

    @Override
    public Vehicle findLicencaPlate(String licencaPlate) {
        return vehicleRepository.findLicencaPlate(licencaPlate);
    }

    @Override
    public void delete(Vehicle vehicle) {
        vehicleRepository.delete(vehicle);
    }
}
