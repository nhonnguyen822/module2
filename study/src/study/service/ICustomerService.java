package study.service;

import study.enity.Customer;


public interface ICustomerService extends IService<Customer> {
    void edit(Customer customer);
    boolean check(String id);
}
