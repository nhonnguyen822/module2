package study.service;

import study.enity.Customer;
import java.util.Queue;
import java.util.Set;


public interface IPromotionService {
    Set<Customer> findAll(int year);

    Queue<Customer> findCustomerVoucher();
}
