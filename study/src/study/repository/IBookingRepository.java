package study.repository;

import study.enity.Booking;

import java.util.Set;

public interface IBookingRepository {
    Set<Booking> findAll();

    void add(Booking booking);


}
