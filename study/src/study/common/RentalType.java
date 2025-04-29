package study.common;

public enum RentalType {
    YEAR("year"),
    MONTH("month"),
    DAY("day"),
    HOUR("hour");
    private final String rentalType;

    RentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getRentalType() {
        return rentalType;
    }

    public static RentalType fromToString(String input) {
        for (RentalType rentalType1 : RentalType.values()) {
            if (rentalType1.getRentalType().equalsIgnoreCase(input.trim())) {
                return rentalType1;
            }
        }
        return null;
    }
}
