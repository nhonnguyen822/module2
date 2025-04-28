package study.service;

import study.enity.Villa;
import study.repository.IVillaRepository;
import study.repository.VillaRepository;

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
}
