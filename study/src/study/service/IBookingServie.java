package study.service;

import study.enity.Booking;

import java.util.Set;

public interface IBookingServie {
    Set<Booking> findAll();
    void updateStatus(Booking booking);
    void add(Booking booking);
}
