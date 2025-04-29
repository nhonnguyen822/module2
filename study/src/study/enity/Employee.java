package study.enity;

import study.common.Gender;
import study.common.TrinhDo;
import study.common.ViTri;

import java.time.LocalDate;

public class Employee extends Person {
    private TrinhDo trinhDo;
    private ViTri viTri;
    private int salary;

    public Employee() {
    }

    public Employee(TrinhDo trinhDo, ViTri viTri, int luong) {
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        salary = luong;
    }

    public Employee(String id, String name, LocalDate birtDay, Gender gender, String numberCMND, String numberPhone, String email, TrinhDo trinhDo, ViTri viTri, int salary) {
        super(id, name, birtDay, gender, numberCMND, numberPhone, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.salary = salary;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                super.toString() +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", Luong=" + salary +
                '}';
    }

    public String convertToString() {
        return super.getId() + ","+super.getName() + ","+super.getBirtDay() + ","+super.getGender() +
                ","+ super.getNumberCMND() + ","+super.getNumberPhone() +","+ super.getEmail() +","+ this.getTrinhDo()+
                ","+ this.getViTri() + ","+this.getSalary();
    }
}
