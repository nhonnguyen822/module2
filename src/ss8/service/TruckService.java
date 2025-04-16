package ss8.service;

import ss8.entity.Motor;
import ss8.entity.Truck;
import ss8.repository.ITruckRepository;
import ss8.repository.TruckRepository;

import java.util.ArrayList;

public class TruckService implements ITruckService {
    private ITruckRepository truckRepository = new TruckRepository();

    @Override
    public ArrayList<Truck> findAll() {
        return truckRepository.finalAll();
    }

    @Override
    public void add(Truck truck) {
        truckRepository.add(truck);
    }

    @Override
    public void display(ArrayList<Truck> trucks) {
        truckRepository.display(trucks);
    }
}
