package study.repository;


import java.util.Map;

public interface IFacilityRepository<T> {
    Map<T, Integer> findAll();

    void add(T t);

    void edit(T t, int usage);



}
