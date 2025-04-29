package study.enity;

import study.common.RentalType;

import java.util.Objects;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
    }

    public Villa(String facilityCode, String facilityName, double usableArea, int rentalCost, int maxOfPeople, RentalType rentalType, String roomStandard, double poolArea) {
        super(facilityCode, facilityName, usableArea, rentalCost, maxOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
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

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "tieuChuanPhong='" + roomStandard + '\'' +
                ", dienTichHoBoi=" + poolArea +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Villa villa = (Villa) object;
        return Double.compare(poolArea, villa.poolArea) == 0 && Objects.equals(roomStandard, villa.roomStandard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roomStandard, poolArea);
    }

    public String convertToString() {
        return super.convertToString() + "," + this.roomStandard + "," + this.poolArea;
    }
}
