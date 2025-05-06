package study.service;

import study.enity.Customer;

import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public interface IPromotionService {
    Set<Customer> findAll(int year);

    Queue<Customer> findCustomerVoucher();
}
