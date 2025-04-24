package ss8.repository;

import ss8.entity.Car;
import ss8.entity.Motor;
import ss8.entity.Truck;
import ss8.entity.Vehicle;
import java.util.ArrayList;
import java.util.List;


public class VehicleRepository implements IVehicleRepository {
    private static final ICarRepository carRepository = new CarRepository();
    private static final IMotorRepository motorRepository = new MotorRepository();
    private static final ITruckRepository truckRepository = new TruckRepository();

    @Override
    public List<Vehicle> findAdd() {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.addAll(carRepository.findAll());
        vehicleList.addAll(motorRepository.finalAll());
        vehicleList.addAll(truckRepository.finalAll());
        return vehicleList;
    }

    @Override
    public Vehicle findLicencaPlate(String licencaPlate) {
        for (int i = 0; i < findAdd().size(); i++) {
            if (findAdd().get(i).getLicenseplate().equals(licencaPlate)) {
                return findAdd().get(i);
            }
        }
        return null;
    }

    @Override
    public void delete(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            carRepository.delete((Car) vehicle);
        } else if (vehicle instanceof Truck) {
            truckRepository.delete((Truck) vehicle);
        } else if (vehicle instanceof Motor) {
            motorRepository.delete((Motor) vehicle);
        }
    }
}
