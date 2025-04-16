package ss8.repository;


import ss8.entity.Truck;

import java.util.ArrayList;

public class TruckRepository implements ITruckRepository {
    private static ArrayList<Truck> trucks = new ArrayList<>();

    static {
        trucks.add(new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3));
        trucks.add(new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9));
        trucks.add(new Truck("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12));
    }

    @Override
    public ArrayList<Truck> finalAll() {
        return trucks;
    }

    @Override
    public void add(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public void delete(Truck truck) {
        trucks.remove(truck);
    }

    @Override
    public void display(ArrayList<Truck> trucks) {
        for (int i = 0; i < trucks.size(); i++) {
            System.out.println(trucks.get(i));
        }
    }
}
