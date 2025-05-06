package study.repository;


import java.util.Map;

public interface IFacilityRepository<T> {
    Map<T, Integer> findAll();

    void add(T t);

    void updateUsage(T t, int usage);
    Map<T, Integer> getFacilityNotUsed();


}
