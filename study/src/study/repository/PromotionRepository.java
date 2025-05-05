package study.repository;

import study.common.ReadAndWriteDaTa;
import study.enity.Booking;
import study.enity.Customer;

import java.util.*;

public class PromotionRepository implements IPromotionRepository {
    private static final String PROMOTION_FILE = "src/study/data/khach_hang_nhan_voucher.csv";
    private static final boolean NOT_APPEND = false;
    private static final IBookingRepository bookingRepository = new BookingRepository();
    private static final CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll(int year) {
        List<Customer> customerList = customerRepository.findAll();
        Set<Customer> customers = new LinkedHashSet<>();
        Set<Booking> bookingSet = bookingRepository.findAll();
        for (Booking booking : bookingSet) {
            if (booking.getBookingDate().getYear() == year) {
                for (Customer customer : customerList) {
                    if (customer.getId().equals(booking.getCustomerCode())) {
                        customers.add(customer);
                    }
                }
            }
        }
        List<Customer> customerStack = new Stack<>();
        customerStack.addAll(customers);
        List<String> stringList = customerRepository.convertToStringList(customerStack);
        ReadAndWriteDaTa.writeFileCSV(PROMOTION_FILE, stringList, NOT_APPEND);
        return customerStack;
    }

    @Override
    public List<Customer> findCustomerVoucher() {
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(PROMOTION_FILE);
        return customerRepository.convertToCustomerList(stringList);
    }
}
