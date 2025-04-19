package bai_tap_them.case_study.enity;

public abstract class Person {
    private String id;
    private String name;
    private String birtDay;
    private String gender;
    private String numberCMND;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String birtDay,
                  String gender, String numberCMND, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.birtDay = birtDay;
        this.gender = gender;
        this.numberCMND = numberCMND;
        this.phoneNumber = phoneNumber;
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

    public String getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(String birtDay) {
        this.birtDay = birtDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumberCMND() {
        return numberCMND;
    }

    public void setNumberCMND(String numberCMND) {
        this.numberCMND = numberCMND;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
                "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", birtDay='" + birtDay + '\'' +
                        ", gioiTinh='" + gender + '\'' +
                        ", soCMND='" + numberCMND + '\'' +
                        ", phoneNumber=" + phoneNumber +
                        ", email='" + email + '\'';
    }
}
