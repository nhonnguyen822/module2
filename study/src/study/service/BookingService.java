package study.service;

import study.enity.*;
import study.repository.*;


import java.util.Map;
import java.util.Set;

public class BookingService implements IBookingServie {
    private static final IBookingRepository bookingRepository = new BookingRepository();
    private static final IFacilityService<Facility> facilityService = new FacilityService();
    private static final IVillaService villaService = new VillaService();
    private static final IRoomService roomService = new RoomService();
    private static final IHouseService houseService = new HouseService();

    @Override
    public Set<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public void edit(Booking booking) {
        bookingRepository.edit(booking);
    }

    @Override
    public void add(Booking booking) {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityService.findAll().entrySet()) {
            if (facilityIntegerEntry.getKey().getFacilityCode().equals(booking.getFacilityCode())) {
                Facility facility = facilityIntegerEntry.getKey();
                facility.setStatus(true);
                if (facility instanceof Villa) {
                    int newUsage = facilityIntegerEntry.getValue() + 1;
                    villaService.edit((Villa) facility, newUsage);
                } else if (facility instanceof House) {
                    int newUsage = facilityIntegerEntry.getValue() + 1;
                    houseService.edit((House) facility, newUsage);
                } else {
                    int newUsage = facilityIntegerEntry.getValue() + 1;
                    roomService.edit((Room) facility, newUsage);
                }
            }
        }
        bookingRepository.add(booking);
    }
}
