package ss15.thuc_hanh.thuc_hanh_3;

public enum Gender {
    MALE("NAM"),
    FEMALE("Nữ");
    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.gender;
    }
}
