package study.service;

import study.enity.Facility;

import java.util.Map;

public interface IFacilityService {
    Map<Facility, Integer> findAll();

    void add(Facility facility);
}
