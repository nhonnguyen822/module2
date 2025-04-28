package study.common;

public enum GioiTinh {
    NAM("Nam"),
    NU("Nữ");
    private final String gioiTinh;

    GioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public static GioiTinh fromToString(String input) {
        for (GioiTinh gioiTinh1 : GioiTinh.values()) {
            if (gioiTinh1.getGioiTinh().equalsIgnoreCase(input.trim())) {
                return gioiTinh1;
            }
        }
        return null;
    }
}
