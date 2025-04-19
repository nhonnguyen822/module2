package bai_tap_them.case_study.enity;

public class Booking {
    private String iDBooking;
    private String dateBooking;
    private String starInvesting;
    private String endInvesting;
    private String customerCode;
    private String serviceCode;

    public Booking() {
    }

    public Booking(String maBooking, String dateBooking,
                   String starInvesting, String endInvesting,
                   String customerCode, String serviceCode) {
        this.iDBooking = maBooking;
        this.dateBooking = dateBooking;
        this.starInvesting = starInvesting;
        this.endInvesting = endInvesting;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
    }

    public String getiDBooking() {
        return iDBooking;
    }

    public void setiDBooking(String iDBooking) {
        this.iDBooking = iDBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getStarInvesting() {
        return starInvesting;
    }

    public void setStarInvesting(String starInvesting) {
        this.starInvesting = starInvesting;
    }

    public String getEndInvesting() {
        return endInvesting;
    }

    public void setEndInvesting(String endInvesting) {
        this.endInvesting = endInvesting;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking='" + iDBooking + '\'' +
                ", ngayBooking='" + dateBooking + '\'' +
                ", ngayBatDauThue='" + starInvesting + '\'' +
                ", ngayKetThucThue='" + endInvesting + '\'' +
                ", maKhachHang='" + customerCode + '\'' +
                ", maDichVu='" + serviceCode + '\'' +
                '}';
    }
}
