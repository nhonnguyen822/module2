package study.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    void add(T t);
}
