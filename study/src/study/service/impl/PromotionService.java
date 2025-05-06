package study.service.impl;

import study.enity.Customer;
import study.repository.IPromotionRepository;
import study.repository.impl.PromotionRepository;
import study.service.IPromotionService;

import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class PromotionService implements IPromotionService {
    private static final IPromotionRepository promotionRepository = new PromotionRepository();

    @Override
    public Set<Customer> findAll(int year) {
        return promotionRepository.findAll(year);
    }

    @Override
    public Queue<Customer> findCustomerVoucher() {
        return promotionRepository.findCustomerVoucher();
    }
}
