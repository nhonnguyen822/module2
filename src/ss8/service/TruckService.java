package ss8.service;


import ss8.entity.Truck;
import ss8.repository.ITruckRepository;
import ss8.repository.TruckRepository;
import java.util.List;

public class TruckService implements ITruckService {
    private ITruckRepository truckRepository = new TruckRepository();

    @Override
    public List<Truck> findAll() {
        return truckRepository.finalAll();
    }

    @Override
    public void add(Truck truck) {
        truckRepository.add(truck);
    }

}
