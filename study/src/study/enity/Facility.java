package study.enity;

import study.common.RentalType;

import java.util.Objects;

public abstract class Facility {
    private String facilityCode;
    private String facilityName;
    private double usableArea;
    private int rentalCost;
    private int maxOfPeople;
    private RentalType rentalType;

    public Facility() {
    }

    public Facility(String facilityCode, String facilityName, double usableArea, int rentalCost, int maxOfPeople, RentalType rentalType) {
        this.facilityCode = facilityCode;
        this.facilityName = facilityName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxOfPeople = maxOfPeople;
        this.rentalType = rentalType;
    }


    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxOfPeople() {
        return maxOfPeople;
    }

    public void setMaxOfPeople(int maxOfPeople) {
        this.maxOfPeople = maxOfPeople;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "maDV='" + facilityCode + '\'' +
                        ", tenDV='" + facilityName + '\'' +
                        ", dienTichSuDung=" + usableArea +
                        ", chiPhiThue=" + rentalCost +
                        ", soLuongNguoiToiDa=" + maxOfPeople +
                        ", kieuThue=" + rentalType
                ;
    }

    public void setDienTichSuDung(double usableArea) {
        this.usableArea = usableArea;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Facility facility = (Facility) object;
        return Double.compare(usableArea, facility.usableArea) == 0 && rentalCost == facility.rentalCost
                && maxOfPeople == facility.maxOfPeople && Objects.equals(facilityCode, facility.facilityCode)
                && Objects.equals(facilityName, facility.facilityName) && rentalType == facility.rentalType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(facilityCode, facilityName, usableArea, rentalCost, maxOfPeople, rentalType);
    }

    public String convertToString() {
        return this.facilityCode +","+ this.facilityName +","+this.usableArea +","+ this.rentalCost +","+ this.maxOfPeople +","+ this.rentalType;
    }
}
