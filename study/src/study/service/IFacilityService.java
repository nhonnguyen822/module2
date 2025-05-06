package study.service;

import java.util.Map;

public interface IFacilityService<T> {
    Map<T, Integer> findAll();

    void add(T t);

    void updateUsage(T t, int usage);
    Map<T, Integer> getFacilityNotUsed();

}
