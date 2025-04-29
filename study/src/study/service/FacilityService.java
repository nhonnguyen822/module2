package study.service;

import study.enity.Facility;
import study.repository.FacilityRepository;
import study.repository.IFacilityRepository;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private static final IFacilityRepository<Facility> dichVuRepository = new FacilityRepository();


    @Override
    public Map<Facility, Integer> findAll() {
        return dichVuRepository.findAll();
    }

    @Override
    public void add(Facility facility) {
        dichVuRepository.add(facility);
    }
}
