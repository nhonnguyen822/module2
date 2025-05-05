package study.repository;

import study.enity.Booking;
import study.enity.Customer;

import java.util.List;

public interface IPromotionRepository {
    List<Customer> findAll(int year);

    List<Customer> findCustomerVoucher();
}
