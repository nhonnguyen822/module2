package study.service;

import study.enity.Booking;

import java.util.Set;

public interface IBookingServie {
    Set<Booking> findAll();

    void add(Booking booking);
}
