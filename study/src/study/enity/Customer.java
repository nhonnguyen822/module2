package study.enity;

import study.common.Gender;
import study.common.CustomerType;

import java.time.LocalDate;
import java.util.Objects;

public class Customer extends Person {
    private CustomerType customerType;
    private String address;

    public Customer() {
    }

    public Customer(CustomerType customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, LocalDate birtDay, Gender gender, String numberCMND, String numberPhone, String email, CustomerType customerType, String address) {
        super(id, name, birtDay, gender, numberCMND, numberPhone, email);
        this.customerType = customerType;
        this.address = address;

    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }


    @Override
    public String toString() {
        return "KhachHang{" +
                super.toString() +
                "loaiKH='" + customerType + '\'' +
                ", diaChi='" + address + '\'' +
                '}';
    }

    public String convertToString() {
        return super.getId() + "," + super.getName() + "," + super.getBirtDay() + "," + super.getGender() + "," +
                super.getNumberCMND() + "," + super.getNumberPhone() + "," + super.getEmail() + ","
                + this.getCustomerType() + "," + this.getAddress();
    }
}
