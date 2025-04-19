package bai_tap_them.case_study.service;

import bai_tap_them.case_study.enity.Customer;
import bai_tap_them.case_study.repository.CustomerRepository;
import bai_tap_them.case_study.repository.ICustomerRepository;
import ss8.repository.ICarRepository;

import java.util.ArrayList;

public class CustomerService implements ICustomerService {
    private static final ICustomerRepository customers = new CustomerRepository();

    @Override
    public ArrayList<Customer> findALL() {
        return customers.findALL();
    }

    @Override
    public void add(Customer entity) {
        customers.add(entity);
    }

    @Override
    public void edit(String customerId) {
        customers.edit(customerId);
    }
}
