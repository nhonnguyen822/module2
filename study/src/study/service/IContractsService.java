package study.service;

import study.enity.Booking;
import study.enity.Contracts;

import java.util.Queue;
import java.util.Set;

public interface IContractsService {
    Queue<Contracts> findAll();

    Queue<Booking> convertBookingFromSetToQueue(Set<Booking> bookingSet);

    void edit( Queue<Contracts> contracts,String contractId);

    void add();
}
