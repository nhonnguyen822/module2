package study.enity;

import study.common.RentalType;

import java.util.Objects;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String facilityCode, String facilityName, double usableArea, int rentalCost, int maxOfPeople, RentalType rentalType, String freeService) {
        super(facilityCode, facilityName, usableArea, rentalCost, maxOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "dichVuMienPhi='" + freeService + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Room room = (Room) object;
        return Objects.equals(freeService, room.freeService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freeService);
    }

    public String convertToString() {
        return super.convertToString() + "," + this.freeService;
    }

}
