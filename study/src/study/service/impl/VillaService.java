package study.service.impl;

import study.enity.Villa;
import study.repository.IVillaRepository;
import study.repository.impl.VillaRepository;
import study.service.IVillaService;

import java.util.Map;

public class VillaService implements IVillaService {
    private static final IVillaRepository villaRepository = new VillaRepository();

    @Override
    public Map<Villa, Integer> findAll() {
        return villaRepository.findAll();
    }

    @Override
    public void add(Villa villa) {
        villaRepository.add(villa);
    }

    @Override
    public void updateUsage(Villa villa, int usage) {
        villaRepository.updateUsage(villa, usage);
    }

    @Override
    public Map<Villa, Integer> getFacilityNotUsed() {

        return villaRepository.getFacilityNotUsed();
    }

}
