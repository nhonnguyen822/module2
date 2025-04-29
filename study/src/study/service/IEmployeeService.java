package study.service;

import study.enity.Employee;

public interface IEmployeeService extends IService<Employee>{
    void edit(Employee employee , String id);
}
