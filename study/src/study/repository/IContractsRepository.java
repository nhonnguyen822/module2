package study.repository;

import study.enity.Booking;
import study.enity.Contracts;

import java.util.Queue;
import java.util.Set;

public interface IContractsRepository {
    Queue<Booking> convertBookingFromSetToQueue(Set<Booking> bookingSet);
    Queue<Contracts> findAll();
    void edit(Contracts contracts);
    void add(Contracts contracts);
}
