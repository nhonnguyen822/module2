package ss8.repository;

import ss8.entity.Car;
import ss8.entity.Motor;
import ss8.entity.Truck;
import ss8.entity.Vehicle;
import java.util.ArrayList;


public class VehicleRepository implements IVehicleRepository {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static ICarRepository carRepository = new CarRepository();
    private static IMotorRepository motorRepository = new MotorRepository();
    private static ITruckRepository truckRepository = new TruckRepository();

    @Override
    public ArrayList<Vehicle> findAdd() {
        ArrayList<Car> cars = carRepository.findAll();
        for (int i = 0; i < cars.size(); i++) {
            vehicles.add(cars.get(i));
        }
        ArrayList<Truck> trucks = truckRepository.finalAll();
        for (int i = 0; i < trucks.size(); i++) {
            vehicles.add(trucks.get(i));
        }
        ArrayList<Motor> motors = motorRepository.finalAll();
        for (int i = 0; i < motors.size(); i++) {
            vehicles.add(motors.get(i));
        }
        return vehicles;
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
