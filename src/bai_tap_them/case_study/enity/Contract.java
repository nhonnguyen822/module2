package bai_tap_them.case_study.enity;

public class Contract {
    private String soHopDong;
    private String maBooking;
    private double soTienCoc;
    private double tongSoTien;

    public Contract() {
    }

    public Contract(String soHopDong, String maBooking, double soTienCoc, double tongSoTien) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCoc = soTienCoc;
        this.tongSoTien = tongSoTien;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public double getSoTienCoc() {
        return soTienCoc;
    }

    public void setSoTienCoc(double soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public double getTongSoTien() {
        return tongSoTien;
    }

    public void setTongSoTien(double tongSoTien) {
        this.tongSoTien = tongSoTien;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong='" + soHopDong + '\'' +
                ", maBooking='" + maBooking + '\'' +
                ", soTienCoc=" + soTienCoc +
                ", tongSoTien=" + tongSoTien +
                '}';
    }
}
