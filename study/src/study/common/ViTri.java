package study.common;

public enum ViTri {
    //    lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
    LE_TAN("lễ tân"),
    PHUC_VU("phục vụ"),
    CHUYEN_VIEN("chuyên viên"),
    GIAM_SAT("giám sát"),
    QUAN_LY("quản lý"),
    GIAM_DOC("giám đốc");
    private final String viTri;

    ViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getViTri() {
        return viTri;
    }

    public static ViTri fromToString(String input) {
        for (ViTri viTri1 : ViTri.values()) {
            if (viTri1.getViTri().equalsIgnoreCase(input.trim())) {
                return viTri1;
            }
        }
        return null;
    }
}
