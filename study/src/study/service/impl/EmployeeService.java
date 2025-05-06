package study.service.impl;


import study.enity.Employee;
import study.repository.IEmployeeRepository;
import study.repository.impl.EmployeeRepository;
import study.service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static final IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void edit(Employee employee, String id) {
        List<Employee> nhanVienList = employeeRepository.findAll();
        boolean flag = false;
        for (int i = 0; i <nhanVienList.size(); i++) {
            if (nhanVienList.get(i).getId().equals(id)) {
                employeeRepository.edit(employee, id);
                System.out.println("đổi thành công ");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("không tìm thấy mã khách hàng ");
        }
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
