package bai_tap_them.case_study.repository;

import bai_tap_them.case_study.enity.Employee;

import java.util.ArrayList;

public interface IEmployeeRepository extends IRepository<Employee> {
    Employee edit(Employee employee);
}
