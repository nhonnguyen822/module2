package study.service;

import study.enity.Customer;
import study.repository.IBookingRepository;
import study.repository.IPromotionRepository;
import study.repository.PromotionRepository;

import java.util.List;
import java.util.Set;
import java.util.Stack;

public class PromotionService implements IPromotionService {
    private static final IPromotionRepository promotionRepository = new PromotionRepository();

    @Override
    public Set<Customer> findAll(int year) {
        return promotionRepository.findAll(year);
    }

    @Override
    public Stack<Customer> findCustomerVoucher() {
        return promotionRepository.findCustomerVoucher();
    }
}
