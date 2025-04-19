package bai_tap_them.case_study.enity;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private double usableArea;
    private double expense;
    private int numblePeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, double usableArea, double expense,
                    int numberPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.expense = expense;
        this.numblePeople = numberPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public int getNumblePeople() {
        return numblePeople;
    }

    public void setNumblePeople(int numblePeople) {
        this.numblePeople = numblePeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "maDV='" + serviceCode + '\'' +
                        ", tenDV='" + serviceName + '\'' +
                        ", dienTichSD=" + usableArea +
                        ", chiPhi=" + expense +
                        ", sLNguoi=" + numblePeople +
                        ", kieuThue='" + rentalType + '\''
                ;
    }
}