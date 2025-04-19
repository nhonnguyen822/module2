package bai_tap_them.case_study.enity;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String customerType, String diaChi) {
        this.customerType = customerType;
        this.address = diaChi;
    }

    public Customer(String id, String name, String birtDay, String gender, String numberCMND,
                    String phoneNumber, String email, String CustomerType, String address) {
        super(id, name, birtDay, gender, numberCMND, phoneNumber, email);
        this.customerType = CustomerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                " loaiKhach='" + customerType + '\'' +
                ", diaChi='" + address + '\'' +
                '}';
    }
}
