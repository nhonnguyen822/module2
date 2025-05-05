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
    private boolean status = false;

    public Facility() {
    }

    public Facility(boolean status, String facilityCode, String facilityName, double usableArea,
                    int rentalCost, int maxOfPeople, RentalType rentalType) {
        this.status = status;
        this.facilityCode = facilityCode;
        this.facilityName = facilityName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxOfPeople = maxOfPeople;
        this.rentalType = rentalType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public String convertToString() {
        return this.status + "," + this.facilityCode + "," + this.facilityName + "," + this.usableArea + ","
                + this.rentalCost + "," + this.maxOfPeople + "," + this.rentalType;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Facility facility = (Facility) object;
        return Objects.equals(facilityCode, facility.facilityCode) && Objects.equals(facilityName, facility.facilityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facilityCode, facilityName);
    }
}
