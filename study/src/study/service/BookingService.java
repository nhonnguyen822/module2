package study.service;

import study.enity.Booking;
import study.enity.Facility;
import study.repository.BookingRepository;
import study.repository.IBookingRepository;


import java.util.Map;
import java.util.Set;

public class BookingService implements IBookingServie {
    private static final IBookingRepository bookingRepository = new BookingRepository();
    private static final IFacilityService facilityService = new FacilityService();

    @Override
    public Set<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public void add(Booking booking) {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityService.findAll().entrySet()) {
            if (facilityIntegerEntry.getKey().getFacilityCode().equals(booking.getBookingCode())) {
                facilityIntegerEntry.setValue(facilityIntegerEntry.getValue() + 1);
            }
        }
        bookingRepository.add(booking);
    }
}
