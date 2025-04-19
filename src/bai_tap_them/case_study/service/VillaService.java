package bai_tap_them.case_study.service;

import bai_tap_them.case_study.enity.Villa;
import bai_tap_them.case_study.repository.IVillaRepository;
import bai_tap_them.case_study.repository.VillaRepository;

import java.util.ArrayList;

public class VillaService implements IVillaService {
    private static final IVillaRepository villaRepository = new VillaRepository();

    @Override
    public ArrayList<Villa> findALL() {
        return villaRepository.findALL();
    }

    @Override
    public void add(Villa villa) {
        villaRepository.add(villa);
    }
}
