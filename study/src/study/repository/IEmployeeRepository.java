package study.repository;

import study.enity.Employee;

public interface IEmployeeRepository extends IRepository<Employee> {
    void edit(Employee nhanVien, String maNV);
}
