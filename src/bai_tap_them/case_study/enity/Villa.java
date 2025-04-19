package bai_tap_them.case_study.enity;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double dienTichHoBoi, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = dienTichHoBoi;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceCode, String serviceName, double usableArea, double expense,
                 int numberPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, expense, numberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + roomStandard + '\'' +
                ", dienTichHoBoi=" + poolArea +
                ", soTang=" + numberOfFloors + super.toString() +
                '}';
    }
}
