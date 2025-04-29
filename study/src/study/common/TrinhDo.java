package study.common;

public enum TrinhDo {
    TRUNG_CAP("Trung cấp"),
    CAO_DANG("Cao đẳng"),
    DAI_HOC("Đại học"),
    SAU_DAI_HOC("Sau đại học");
    private final String trinhDo;

    TrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public static TrinhDo fromToString(String input) {
        for (TrinhDo trinhDo1 : TrinhDo.values()) {
            if (trinhDo1.getTrinhDo().equalsIgnoreCase(input.trim())) {
                return trinhDo1;
            }
        }
        return null;
    }
}
