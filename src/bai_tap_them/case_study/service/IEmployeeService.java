package bai_tap_them.case_study.service;

import bai_tap_them.case_study.enity.Employee;

public interface IEmployeeService extends IService<Employee> {
    Employee edit(Employee employee);
}
