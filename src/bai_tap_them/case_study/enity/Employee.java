package bai_tap_them.case_study.enity;

public class Employee extends Person {
    private String level;
    private String role;
    private double salary;

    public Employee() {
    }

    public Employee(String trinhDo, String role, double salary) {
        this.level = trinhDo;
        this.role = role;
        this.salary = salary;

    }

    public Employee(String id, String name, String birtDay, String gender,
                    String numberCMND, String phoneNumber, String email,
                    String level, String role, double salary) {
        super(id, name, birtDay, gender, numberCMND, phoneNumber, email);
        this.level = level;
        this.role = role;

        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                " trinhDo='" + level +
                ", viTri='" + role +
                ", Luong=" + salary +
                '}';
    }
}
