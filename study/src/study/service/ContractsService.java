package study.service;

import study.enity.*;
import study.repository.ContractsRepository;
import study.repository.IContractsRepository;

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
    public void add(Contracts contracts) {
        Set<Booking> bookingSet = bookingService.findAll();
        for (Booking booking : bookingSet) {
            if (booking.getBookingCode().equals(contracts.getBookingCode())) {
                bookingService.edit(booking);
                break;
            }
        }

        contractsRepository.add(contracts);
    }
}
