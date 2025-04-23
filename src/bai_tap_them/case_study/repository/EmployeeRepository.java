package bai_tap_them.case_study.repository;

import bai_tap_them.case_study.enity.Employee;
import bai_tap_them.case_study.enity.Person;
import bai_tap_them.case_study.view.EmployeeView;

import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository {
    private static final ArrayList<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("NV-0001", "Nguyen Van A", "01/01/2003",
                "Nam", "123456789", "0123456789",
                "kimtin@gmail.com", "Manager", "VeSinh", 15000000));
        employees.add(new Employee("NV-0002", "Nguyen Van B", "01/01/2003",
                "Nam", "123456789", "0123456789",
                "kimtin@gmail.com", "Manager", "VeSinh", 15000000));
        employees.add(new Employee("NV-0003", "Nguyen Van C", "01/01/2003",
                "Nam", "123456789", "0123456789",
                "kimtin@gmail.com", "Manager", "Tiep Vien", 15000000));

    }

    @Override
    public ArrayList<Employee> findALL() {
        return employees;
    }


    @Override
    public void add(Employee employee) {
        employees.add(employee);

    }

    @Override
    public Employee edit(Employee employee) {
        return employee;
    }
}
