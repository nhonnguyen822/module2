package study.common;

public enum KieuThue {
    NAM("Năm"),
    THANG("Tháng"),
    NGAY("Ngày"),
    GIO("Giờ");
    private final String kieuThue;

    KieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public static KieuThue fromToString(String input) {
        for (KieuThue kieuThue1 : KieuThue.values()) {
            if (kieuThue1.getKieuThue().equalsIgnoreCase(input.trim())) {
                return kieuThue1;
            }
        }
        return null;
    }
}
