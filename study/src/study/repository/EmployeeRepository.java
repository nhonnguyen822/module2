package study.repository;

import study.common.Gender;
import study.common.ReadAndWriteDaTa;
import study.common.TrinhDo;
import study.common.ViTri;
import study.enity.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository implements IEmployeeRepository {
    private static final String NHAN_VIEN_FILE = "src/study/data/nhan_vien.csv";
    private static final boolean NOT_APPEND = false;

    public static List<String> convertToStringList(List<Employee> employeeList) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            stringList.add(employeeList.get(i).convertToString());
        }
        return stringList;
    }

    @Override
    public void edit(Employee employee, String maNV) {
        List<Employee> employeeList = findAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(maNV)) {
                employeeList.get(i).setName(employee.getName());
                employeeList.get(i).setBirtDay(employee.getBirtDay());
                employeeList.get(i).setGender(employee.getGender());
                employeeList.get(i).setNumberCMND(employee.getNumberCMND());
                employeeList.get(i).setNumberPhone(employee.getNumberPhone());
                employeeList.get(i).setEmail(employee.getEmail());
                employeeList.get(i).setTrinhDo(employee.getTrinhDo());
                employeeList.get(i).setViTri(employee.getViTri());
                employeeList.get(i).setSalary(employee.getSalary());
                break;
            }
        }
        List<String> stringList = convertToStringList(employeeList);
        ReadAndWriteDaTa.writeFileCSV(NHAN_VIEN_FILE, stringList, NOT_APPEND);
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> nhanVienList = new ArrayList<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(NHAN_VIEN_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String[] line = stringList.get(i).split(",");
            if (line.length == 10) {
                try {
                    String ma = line[0];
                    String name = line[1];
                    LocalDate birthDay = LocalDate.parse(line[2]);
                    Gender gender = Gender.valueOf(line[3]);
                    String numberCMND = line[4];
                    String numberPhone = line[5];
                    String email = line[6];
                    TrinhDo trinhDo = TrinhDo.valueOf(line[7]);
                    ViTri viTri = ViTri.valueOf(line[8]);
                    int salary = Integer.parseInt(line[9]);
                    nhanVienList.add(new Employee(ma, name, birthDay, gender, numberCMND, numberPhone, email, trinhDo, viTri, salary));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
        return nhanVienList;
    }

    @Override
    public void add(Employee employee) {
        List<Employee> nhanVienList = findAll();
        nhanVienList.add(employee);
        List<String> stringList = convertToStringList(nhanVienList);
        ReadAndWriteDaTa.writeFileCSV(NHAN_VIEN_FILE, stringList, NOT_APPEND);
    }
}
