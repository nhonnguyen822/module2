package study.enity;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String bookingCode;
    private LocalDate bookingDate;
    private LocalDate rentalStarDay;
    private LocalDate rentalEndDay;
    private String customerCode;
    private String customerName;
    private String facilityCode;
    private boolean status = false;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Booking(String bookingCode, LocalDate bookingDate, LocalDate rentalStarBooking,
                   LocalDate rentalEndBooking, String customerCode, String customerName, String facilityCode, boolean status) {
        this.bookingCode = bookingCode;
        this.bookingDate = bookingDate;
        this.rentalStarDay = rentalStarBooking;
        this.rentalEndDay = rentalEndBooking;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.facilityCode = facilityCode;
        this.status = status;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getRentalStarDay() {
        return rentalStarDay;
    }

    public void setRentalStarDay(LocalDate rentalStarDay) {
        this.rentalStarDay = rentalStarDay;
    }

    public LocalDate getRentalEndDay() {
        return rentalEndDay;
    }

    public void setRentalEndDay(LocalDate rentalEndDay) {
        this.rentalEndDay = rentalEndDay;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", bookingDate=" + bookingDate +
                ", rentalStarBooking=" + rentalStarDay +
                ", rentalEndBooking=" + rentalEndDay +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", facilityCode='" + facilityCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Booking booking = (Booking) object;
        return Objects.equals(bookingCode, booking.bookingCode) && Objects.equals(rentalEndDay, booking.rentalEndDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingCode, rentalEndDay);
    }

    @Override
    public int compareTo(Booking o) {
        if (this.getBookingDate().equals(o.bookingDate)) {
            return this.getRentalEndDay().compareTo(o.getRentalEndDay());
        }
        return this.getBookingDate().compareTo(o.getBookingDate());
    }

    public String convertToString() {
        return this.bookingCode + "," + this.bookingDate + "," + this.rentalStarDay + "," + this.rentalEndDay
                + "," + this.customerCode + "," + this.customerName + "," + this.facilityCode + "," + this.status;
    }
}
