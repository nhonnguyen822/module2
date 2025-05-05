package study.service;

import study.enity.Facility;

import java.util.Map;

public interface IFacilityService<T> {
    Map<T, Integer> findAll();

    void add(T t);

    void edit(T t, int usage);

}
