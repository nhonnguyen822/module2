package study.service.impl;

import study.enity.Customer;
import study.repository.ICustomerRepository;
import study.repository.impl.CustomerRepository;
import study.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private static final ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void edit(Customer customer, String maKH) {
        List<Customer> customerList = customerRepository.findAll();
        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(maKH)) {
                customerRepository.edit(customer, maKH);
                System.out.println("đổi thành công ");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("không tìm thấy mã khách hàng ");
        }
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
