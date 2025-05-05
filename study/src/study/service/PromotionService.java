package study.service;

import study.enity.Customer;
import study.repository.IBookingRepository;
import study.repository.IPromotionRepository;
import study.repository.PromotionRepository;

import java.util.List;

public class PromotionService implements IPromotionService {
    private static final IPromotionRepository promotionRepository = new PromotionRepository();

    @Override
    public List<Customer> findAll(int year) {
        return promotionRepository.findAll(year);
    }

    @Override
    public List<Customer> findCustomerVoucher() {
        return promotionRepository.findCustomerVoucher();
    }
}
