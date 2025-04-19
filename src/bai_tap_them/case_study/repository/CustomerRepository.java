package bai_tap_them.case_study.repository;

import bai_tap_them.case_study.enity.Customer;
import bai_tap_them.case_study.enity.Person;
import bai_tap_them.case_study.view.CustomerView;
import bai_tap_them.case_study.view.EmployeeView;

import java.util.ArrayList;

public class CustomerRepository implements ICustomerRepository {
    private static final ArrayList<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer("KH-001", "Nguyen Thi A", "1/1/2011", "NU",
                "123456789", "01234567890", "kimtim@gmail.com",
                "VIP", "TaySon"));
        customers.add(new Customer("KH-002", "Nguyen Thi C", "1/1/2011", "NU",
                "123456789", "01234567890", "kimtim@gmail.com",
                "VIP", "TaySon"));
        customers.add(new Customer("KH-003", "Nguyen Thi C", "1/1/2011", "NU",
                "123456789", "01234567890", "kimtim@gmail.com",
                "VIP", "TaySon"));
    }

    @Override
    public ArrayList<Customer> findALL() {
        return customers;
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);

    }

    @Override
    public void edit(String customerId) {
        boolean test = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(customerId)) {
                CustomerView.editCustomer(customers.get(i));
                System.out.println("đã thay đổi thành công");
                test = true;
                break;
            }
        }
        if (!test) {
            System.out.println("không tim thấy khách hàng ");
        }
    }
}
