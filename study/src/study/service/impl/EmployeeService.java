package study.service.impl;


import study.enity.Employee;
import study.repository.IEmployeeRepository;
import study.repository.impl.EmployeeRepository;
import study.service.IEmployeeService;
import study.view.EmployeeView;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static final IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void edit(Employee employee) {
        employeeRepository.edit(employee);
    }

    @Override
    public boolean check(String id) {
        List<Employee> employees = employeeRepository.findAll();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);
    }
}
