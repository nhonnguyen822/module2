package study.repository;

import study.enity.Booking;
import study.enity.Customer;

import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public interface IPromotionRepository {
    Set<Customer> findAll(int year);

    Queue<Customer> findCustomerVoucher();
}
