package study.repository.impl;

import study.common.ReadAndWriteDaTa;
import study.enity.*;
import study.repository.IBookingRepository;
import java.time.LocalDate;
import java.util.*;

public class BookingRepository implements IBookingRepository {
    private static final String BOOKING_FILE = "src/study/data/booking.csv";
    private static final boolean NOT_APPEND = false;

    private static List<String> convertToListString(Set<Booking> bookingSet) {
        List<String> stringList = new ArrayList<>();
        for (Booking booking : bookingSet) {
            String line = booking.convertToString();
            stringList.add(line);
        }
        return stringList;
    }

    private static Set<Booking> convertToSetBooking(List<String> stringList) {
        Set<Booking> bookingSet = new TreeSet<>();
        for (String string : stringList) {
            String[] line = string.split(",");
            if (line.length == 8) {
                try {
                    String bookingCode = line[0];
                    LocalDate bookingDate = LocalDate.parse(line[1]);
                    LocalDate rentalStarBooking = LocalDate.parse(line[2]);
                    LocalDate rentalEndBooking = LocalDate.parse(line[3]);
                    String customerCode = line[4];
                    String customerName = line[5];
                    String facilityCode = line[6];
                    boolean status= Boolean.parseBoolean(line[7]);
                    bookingSet.add(new Booking(bookingCode, bookingDate, rentalStarBooking,
                            rentalEndBooking, customerCode, customerName, facilityCode,status));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return bookingSet;
    }

    @Override
    public Set<Booking> findAll() {
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(BOOKING_FILE);
        return convertToSetBooking(stringList);
    }

    @Override
    public void updateStatus(Booking booking) {
        Set<Booking> bookingSet = findAll();
        List<Booking> bookings = new ArrayList<>(bookingSet);
        for (Booking booking1 : bookings) {
            if (booking1.getBookingCode().equals(booking.getBookingCode())) {
                booking1.setStatus(true);
                break;
            }
        }
        Set<Booking> editBookingSet = new TreeSet<>(bookings);
        List<String> stringList = convertToListString(editBookingSet);
        ReadAndWriteDaTa.writeFileCSV(BOOKING_FILE, stringList, NOT_APPEND);
    }

    @Override
    public void add(Booking booking) {
        Set<Booking> bookingSet = findAll();
        bookingSet.add(booking);
        List<String> stringList = convertToListString(bookingSet);
        ReadAndWriteDaTa.writeFileCSV(BOOKING_FILE, stringList, NOT_APPEND);
    }
}

