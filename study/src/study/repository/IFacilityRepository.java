package study.repository;

import study.enity.Facility;

import java.util.Map;

public interface IFacilityRepository <T>{
    Map<T, Integer> findAll();

    void add(T t);

}
