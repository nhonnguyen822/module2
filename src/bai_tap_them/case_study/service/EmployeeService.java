package bai_tap_them.case_study.service;

import bai_tap_them.case_study.enity.Employee;
import bai_tap_them.case_study.repository.EmployeeRepository;
import bai_tap_them.case_study.repository.IEmployeeRepository;

import java.util.ArrayList;

public class EmployeeService implements IEmployeeService {
    private static final IEmployeeRepository employeeService = new EmployeeRepository();

    @Override
    public ArrayList<Employee> findALL() {
        return employeeService.findALL();
    }

    @Override
    public void add(Employee employee) {
        employeeService.add(employee);

    }

    @Override
    public Employee edit(Employee employee) {
        return employeeService.edit(employee);
    }
}
