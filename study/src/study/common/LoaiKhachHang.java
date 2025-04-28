package study.common;

public enum LoaiKhachHang {
    //    (Diamond, Platinum, Gold, Silver, Member)
    DIAMOND("Diamond"),
    PLATINUM("Platinum"),
    GOLD("Gold"),
    SILVER("Silver"),
    MEMBER("Member;");
    private final String loaiKH;

    LoaiKhachHang(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public static LoaiKhachHang fromToString(String input) {
        for (LoaiKhachHang loaiKhachHang : LoaiKhachHang.values()) {
            if (loaiKhachHang.getLoaiKH().equalsIgnoreCase(input.trim())) {
                return loaiKhachHang;
            }
        }
        return null;
    }
}
