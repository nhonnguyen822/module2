package study.enity;

import study.common.RentalType;

import java.util.Objects;
public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;
    private boolean status = false;

    public House() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public House(String facilityCode, String facilityName, double usableArea, int rentalCost,
                 int maxOfPeople, RentalType rentalType, String roomStandard, int numberOfFloors) {
        super(facilityCode, facilityName, usableArea, rentalCost, maxOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "tieuChuanPhong='" + roomStandard + '\'' +
                ", soTang=" + numberOfFloors +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        House house = (House) object;
        return numberOfFloors == house.numberOfFloors && Objects.equals(roomStandard, house.roomStandard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roomStandard, numberOfFloors);
    }

    public String convertToString() {
        return super.convertToString() + "," + this.roomStandard + "," + this.numberOfFloors;
    }
}
