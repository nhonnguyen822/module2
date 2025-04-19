package bai_tap_them.case_study.repository;

import bai_tap_them.case_study.enity.Customer;

public interface ICustomerRepository extends IRepository<Customer> {
    void edit(String customerId);
}
