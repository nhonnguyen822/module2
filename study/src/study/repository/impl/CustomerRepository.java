package study.repository.impl;

import study.common.Gender;
import study.common.CustomerType;
import study.common.ReadAndWriteDaTa;
import study.enity.Customer;
import study.repository.ICustomerRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_FILE = "src/study/data/khach_hang.csv";
    private static final boolean NOT_APPEND = false;

    public List<String> convertToStringList(List<Customer> customerList) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            stringList.add(customerList.get(i).convertToString());
        }
        return stringList;
    }

    public List<Customer> convertToCustomerList(List<String> stringList) {
        List<Customer> customerList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] line = stringList.get(i).split(",");
            if (line.length == 9) {
                try {
                    String id = line[0];
                    String name = line[1];
                    LocalDate birthDay = LocalDate.parse(line[2]);
                    Gender gender = Gender.valueOf(line[3]);
                    String numberCMND = line[4];
                    String numberPhone = line[5];
                    String email = line[6];
                    CustomerType customerType = CustomerType.valueOf(line[7]);
                    String address = line[8];

                    customerList.add(new Customer(id, name, birthDay, gender, numberCMND, numberPhone, email, customerType, address));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return customerList;
    }

    @Override
    public List<Customer> findAll() {
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(CUSTOMER_FILE);
        return convertToCustomerList(stringList);
    }

    @Override
    public void add(Customer khachHang) {
        List<Customer> customerList = findAll();
        customerList.add(khachHang);
        List<String> stringList = convertToStringList(customerList);
        ReadAndWriteDaTa.writeFileCSV(CUSTOMER_FILE, stringList, NOT_APPEND);
    }

    @Override
    public void edit(Customer khachHang, String maKH) {
        List<Customer> customerList = findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(maKH)) {
                customerList.get(i).setId(khachHang.getId());
                customerList.get(i).setName(khachHang.getName());
                customerList.get(i).setBirtDay(khachHang.getBirtDay());
                customerList.get(i).setGender(khachHang.getGender());
                customerList.get(i).setNumberCMND(khachHang.getNumberCMND());
                customerList.get(i).setNumberPhone(khachHang.getNumberPhone());
                customerList.get(i).setEmail(khachHang.getEmail());
                customerList.get(i).setCustomerType(khachHang.getCustomerType());
                customerList.get(i).setAddress(khachHang.getAddress());
                break;
            }
        }
        List<String> stringList = convertToStringList(customerList);
        ReadAndWriteDaTa.writeFileCSV(CUSTOMER_FILE, stringList, NOT_APPEND);
    }
}



