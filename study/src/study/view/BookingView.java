package study.view;

import study.enity.Booking;
import study.enity.Customer;
import study.enity.Facility;
import study.service.impl.CustomerService;
import study.service.ICustomerService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                }
            }
            System.out.println("nhập lại mã khách hàng");
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
            System.out.println("nhập lại mã khách hàng");
        }
    }

    public static Booking inputDataBooking(Customer customer, Facility facility) {
        System.out.println("enter booking code format BK-XXXX");
        String bookingCode = scanner.nextLine();
        while (true) {
            String regex = "^BK-\\d{4}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(bookingCode);
            if (matcher.matches()) {
                System.out.println("mã hợp lệ");
                break;
            } else {
                System.out.println("mã không hợp lệ");
            }
        }
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
            System.out.println("nhập ngày bắt đầu thuê");
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
            System.out.println("nhập ngày kết thúc thuê");
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
        boolean status = false;
        return new Booking(bookingCode, bookingDate, rentalStartDay, rentalEndDay, customerCode, customerName, facilityCode, status);
    }
}
