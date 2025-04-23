package bai_tap_them.case_study.service;

import bai_tap_them.case_study.enity.Customer;

public interface ICustomerService extends IService<Customer> {
    Customer edit(Customer customer);
}
