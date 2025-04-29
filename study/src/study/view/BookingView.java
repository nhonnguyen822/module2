package study.view;

import study.enity.Booking;
import study.enity.Customer;
import study.enity.Facility;
import study.service.CustomerService;
import study.service.ICustomerService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICustomerService customerService = new CustomerService();

    public static void display(Set<Booking> bookingSet) {
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

    public static Customer selectCustomerBooking(List<Customer> customerList) {
        while (true) {
            CustomerView.display(customerList);
            String customerId = CustomerView.inputIdCustomer();
            for (int i = 0; i < customerList.size(); i++) {
                if (customerId.equals(customerList.get(i).getId())) {
                    return customerList.get(i);
                } else {
                    System.out.println("nhập id khách hàng chưa đúng");
                }
            }
        }
    }

    public static Facility selectFacilityBooking(Map<Facility, Integer> facilityIntegerMap) {
        while (true) {
            FacilityView.display(facilityIntegerMap);
            String facilityId = FacilityView.inputIdFacility();
            for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
                if (facilityIntegerEntry.getKey().getFacilityCode().equals(facilityId)) {
                    return facilityIntegerEntry.getKey();
                }
            }
        }
    }

    public static Booking inputDataBooking(Customer customer, Facility facility) {
        System.out.println("enter booking code");
        String bookingCode = scanner.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate bookingDate = null;
        while (true) {
            System.out.println("nhập ngày booking");
            String input = scanner.nextLine();
            try {
                bookingDate = LocalDate.parse(input, dateTimeFormatter);
                break;
            } catch (Exception e) {
                System.out.println("ngày không hợp lệ");
            }
        }
        LocalDate rentalStartDay = null;
        while (true) {
            System.out.println("nhập ngày bắt đầu booking");
            String input = scanner.nextLine();
            try {
                rentalStartDay = LocalDate.parse(input, dateTimeFormatter);
                break;
            } catch (Exception e) {
                System.out.println("ngày không hợp lệ");
            }
        }
        LocalDate rentalEndDay = null;
        while (true) {
            System.out.println("nhập ngày bắt đầu booking");
            String input = scanner.nextLine();
            try {
                rentalEndDay = LocalDate.parse(input, dateTimeFormatter);
                break;
            } catch (Exception e) {
                System.out.println("ngày không hợp lệ");
            }
        }
        String customerCode = customer.getId();
        String customerName = customer.getName();
        String facilityCode = facility.getFacilityCode();
        return new Booking(bookingCode, bookingDate, rentalStartDay, rentalEndDay, customerCode, customerName, facilityCode);
    }
}
