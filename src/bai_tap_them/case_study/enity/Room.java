package bai_tap_them.case_study.enity;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String serviceCode, String serviceName, double usableArea, double expense, 
                int numblePeople, String rentalType, String serviceFree) {
        super(serviceCode, serviceName, usableArea, expense, numblePeople, rentalType);
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhi='" + serviceFree + '\'' + super.toString() +
                '}';
    }
}
