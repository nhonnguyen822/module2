package study.service;

import study.enity.Customer;

import java.util.List;

public interface IPromotionService {
    List<Customer> findAll(int year);

    List<Customer> findCustomerVoucher();
}
