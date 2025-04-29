package study.common;

public enum CustomerType {
    //    (Diamond, Platinum, Gold, Silver, Member)
    DIAMOND("Diamond"),
    PLATINUM("Platinum"),
    GOLD("Gold"),
    SILVER("Silver"),
    MEMBER("Member;");
    private final String customerType;

    CustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public static CustomerType fromToString(String input) {
        for (CustomerType customerType : CustomerType.values()) {
            if (customerType.getCustomerType().equalsIgnoreCase(input.trim())) {
                return customerType;
            }
        }
        return null;
    }
}
