package study.controller;

import study.enity.Booking;
import study.enity.Contracts;
import study.enity.Customer;
import study.enity.Facility;
import study.service.*;
import study.service.impl.BookingService;
import study.service.impl.ContractsService;
import study.service.impl.CustomerService;
import study.service.impl.FacilityService;
import study.view.BookingView;
import study.view.ContractView;

import java.util.*;

public class FuramaBookingController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICustomerService customerService = new CustomerService();
    private static final IFacilityService<Facility> facilityService = new FacilityService();
    private static final IBookingServie bookingService = new BookingService();
    private static final IContractsService contractsService = new ContractsService();

    public static void bookingManagement() {
        String exit = "";
        while (true) {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            System.out.println("nhập lựa chọn của bạn");
            try {
                int chose = Integer.parseInt(scanner.nextLine());
                switch (chose) {
                    case 1:
                        List<Customer> customerList = customerService.findAll();
                        Customer customer = BookingView.selectCustomerBooking(customerList);
                        Map<Facility, Integer> facilityIntegerMap = facilityService.getFacilityNotUsed();
                        Facility facility = BookingView.selectFacilityBooking(facilityIntegerMap);
                        Booking booking = BookingView.inputDataBooking(customer, facility);
                        bookingService.add(booking);
                        break;
                    case 2:
                        Set<Booking> bookingSet = bookingService.findAll();
                        BookingView.display(bookingSet);
                        break;
                    case 3:
                        contractsService.add();
                        break;
                    case 4:
                        Queue<Contracts> contractsQueue = contractsService.findAll();
                        ContractView.display(contractsQueue);
                        break;
                    case 5:
                        String contractId = ContractView.inputContractsId();
                        boolean check = contractsService.check(contractId);
                        if (check) {
                            Queue<Contracts> contractsQueueEdit = contractsService.findAll();
                            ContractView.display(contractsQueueEdit);
                            for (Contracts contract : contractsQueueEdit) {
                                if (contract.getContractId().equals(contractId)) {
                                    Contracts contractEdit = ContractView.edit(contract);
                                    contractsService.edit(contractEdit);
                                    System.out.println("đổi thành công ");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("không tìm thấy mã hợp đồng");
                        }
                        break;
                    case 6:
                        System.out.println("bạn chọn quay trở lại ,yes or no");
                        break;
                    default:
                        System.out.println("lựa chọn không hợp lệ ");
                }
                if (chose == 6 && exit.toLowerCase().equals("yes")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
