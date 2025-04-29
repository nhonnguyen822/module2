package study.common;

public enum Gender {
    MALE("nam"),
    FEMALE("nu");
    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public static Gender fromToString(String input) {
        for (Gender gender1 : Gender.values()) {
            if (gender1.getGender().equalsIgnoreCase(input.trim())) {
                return gender1;
            }
        }
        return null;
    }
}
