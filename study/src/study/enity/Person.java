package study.enity;

import study.common.Gender;

import java.time.LocalDate;

public abstract class Person {
    private String id;
    private String name;
    private LocalDate birtDay;
    private Gender gender;
    private String numberCMND;
    private String numberPhone;
    private String email;

    public Person() {
    }

    public Person(String id, String name, LocalDate birtDay, Gender gender, String numberCMND, String numberPhone, String email) {
        this.id = id;
        this.name = name;
        this.birtDay = birtDay;
        this.gender = gender;
        this.numberCMND = numberCMND;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(LocalDate birtDay) {
        this.birtDay = birtDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNumberCMND() {
        return numberCMND;
    }

    public void setNumberCMND(String numberCMND) {
        this.numberCMND = numberCMND;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "ma='" + id + '\'' +
                ", ten='" + name + '\'' +
                ", ngaySinh=" + birtDay +
                ", gioiTinh='" + gender + '\'' +
                ", soCMND='" + numberCMND + '\'' +
                ", soDT='" + numberPhone + '\'' +
                ", email='" + email + '\''
                ;
    }
}
