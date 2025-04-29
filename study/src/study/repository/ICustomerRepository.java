package study.repository;

import study.enity.Customer;

public interface ICustomerRepository extends IRepository<Customer> {
    void edit(Customer khachHang , String maKH);
}
