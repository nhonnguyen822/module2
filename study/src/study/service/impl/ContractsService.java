package study.service.impl;

import study.enity.*;
import study.repository.impl.ContractsRepository;
import study.repository.IContractsRepository;
import study.service.IBookingServie;
import study.service.IContractsService;
import study.service.IFacilityService;
import study.view.ContractView;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;


public class ContractsService implements IContractsService {
    private static final IContractsRepository contractsRepository = new ContractsRepository();
    private static final IFacilityService<Facility> facilityService = new FacilityService();
    private static final IBookingServie bookingService = new BookingService();


    @Override
    public Queue<Contracts> findAll() {
        return contractsRepository.findAll();
    }

    @Override
    public Queue<Booking> convertBookingFromSetToQueue(Set<Booking> bookingSet) {
        Queue<Booking> bookingQueue = new ArrayDeque<>();
        for (Booking booking : bookingSet) {
            if (!booking.getFacilityCode().contains("SVRO") && !booking.isStatus()) {
                bookingQueue.offer(booking);
            }
        }
        return bookingQueue;
    }

    @Override
    public void edit(Contracts contracts) {
        contractsRepository.edit(contracts);
    }

    @Override
    public void add() {
        Set<Booking> bookings = bookingService.findAll();
        Queue<Booking> bookingQueue = convertBookingFromSetToQueue(bookings);
        ContractView.displayListBookingNeedContract(bookingQueue);
        for (Booking booking : bookingQueue) {
            Contracts contract = ContractView.inputDataCreatContract(booking);
            contractsRepository.add(contract);
            bookingService.updateStatus(booking);
            break;
        }
    }

    @Override
    public boolean check(String contractCode) {
        Queue<Contracts> contracts = contractsRepository.findAll();
        for (Contracts contract : contracts) {
            if (contract.getContractId().equals(contractCode)) {
                return true;
            }
        }
        return false;
    }
}
