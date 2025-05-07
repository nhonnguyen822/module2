package study.service.impl;

import study.enity.Customer;
import study.repository.ICustomerRepository;
import study.repository.impl.CustomerRepository;
import study.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private static final ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void edit(Customer customer) {
        customerRepository.edit(customer);
    }

    @Override
    public boolean check(String id) {
        List<Customer> customers = customerRepository.findAll();
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }
}
