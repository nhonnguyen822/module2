package bai_tap_them.case_study.enity;

public class House extends Facility {
    private String roonStandard;
    private int soTang;

    public House() {
    }

    public House(String tieuChuanPhong, int soTang) {
        this.roonStandard = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String serviceCode, String serviceName, double usableArea, double expense,
                 int numberPeople, String rentalType, String roomStandard, int soTang) {
        super(serviceCode, serviceName, usableArea, expense, numberPeople, rentalType);
        this.roonStandard = roomStandard;
        this.soTang = soTang;
    }

    public String getRoonStandard() {
        return roonStandard;
    }

    public void setRoonStandard(String roonStandard) {
        this.roonStandard = roonStandard;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + roonStandard + '\'' +
                ", soTang=" + soTang + super.toString() +
                '}';
    }
}
