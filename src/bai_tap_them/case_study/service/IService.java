package bai_tap_them.case_study.service;

import java.util.ArrayList;

public interface IService<E> {
    ArrayList<E> findALL();
    void add(E entity);
}
