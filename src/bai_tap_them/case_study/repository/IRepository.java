package bai_tap_them.case_study.repository;

import bai_tap_them.case_study.enity.Booking;
import bai_tap_them.case_study.enity.Person;

import java.util.ArrayList;

public interface IRepository<E> {
    ArrayList<E> findALL();

    void add(E entity);
}
