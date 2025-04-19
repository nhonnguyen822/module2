package bai_tap_them.case_study.service;

import bai_tap_them.case_study.enity.Facility;
import bai_tap_them.case_study.repository.FacilityRepository;
import bai_tap_them.case_study.repository.IFacilityRepository;

import java.util.ArrayList;

public class FacilityService implements IFacilityService {
    private static final IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public ArrayList<Facility> findALL() {
        return facilityRepository.findALL();
    }

    @Override
    public void add(Facility facility) {
        facilityRepository.add(facility);

    }
}
